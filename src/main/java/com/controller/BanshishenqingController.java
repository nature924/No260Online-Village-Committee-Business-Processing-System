
package com.controller;

import java.io.File;
import java.math.BigDecimal;
import java.net.URL;
import java.text.SimpleDateFormat;
import com.alibaba.fastjson.JSONObject;
import java.util.*;
import org.springframework.beans.BeanUtils;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import com.service.TokenService;
import com.utils.*;
import java.lang.reflect.InvocationTargetException;

import com.service.DictionaryService;
import org.apache.commons.lang3.StringUtils;
import com.annotation.IgnoreAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.entity.*;
import com.entity.view.*;
import com.service.*;
import com.utils.PageUtils;
import com.utils.R;
import com.alibaba.fastjson.*;

/**
 * 办事申请
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/banshishenqing")
public class BanshishenqingController {
    private static final Logger logger = LoggerFactory.getLogger(BanshishenqingController.class);

    private static final String TABLE_NAME = "banshishenqing";

    @Autowired
    private BanshishenqingService banshishenqingService;


    @Autowired
    private TokenService tokenService;

    @Autowired
    private BanshijiluService banshijiluService;//办事记录
    @Autowired
    private ButiehuodongService butiehuodongService;//补贴活动通告
    @Autowired
    private DangyuanfazhanjiluService dangyuanfazhanjiluService;//党员发展
    @Autowired
    private DictionaryService dictionaryService;//字典
    @Autowired
    private GonggaoService gonggaoService;//公告
    @Autowired
    private GongzuorenyuanService gongzuorenyuanService;//工作人员
    @Autowired
    private LiuyanService liuyanService;//留言板
    @Autowired
    private NongyebutieService nongyebutieService;//农业补贴
    @Autowired
    private TudibiangengService tudibiangengService;//土地变更
    @Autowired
    private YonghuService yonghuService;//用户
    @Autowired
    private UsersService usersService;//管理员


    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永不会进入");
        else if("用户".equals(role))
            params.put("yonghuId",request.getSession().getAttribute("userId"));
        else if("工作人员".equals(role))
            params.put("gongzuorenyuanId",request.getSession().getAttribute("userId"));
        CommonUtil.checkMap(params);
        PageUtils page = banshishenqingService.queryPage(params);

        //字典表数据转换
        List<BanshishenqingView> list =(List<BanshishenqingView>)page.getList();
        for(BanshishenqingView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c, request);
        }
        return R.ok().put("data", page);
    }

    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        BanshishenqingEntity banshishenqing = banshishenqingService.selectById(id);
        if(banshishenqing !=null){
            //entity转view
            BanshishenqingView view = new BanshishenqingView();
            BeanUtils.copyProperties( banshishenqing , view );//把实体数据重构到view中
            //级联表 用户
            //级联表
            YonghuEntity yonghu = yonghuService.selectById(banshishenqing.getYonghuId());
            if(yonghu != null){
            BeanUtils.copyProperties( yonghu , view ,new String[]{ "id", "createTime", "insertTime", "updateTime", "yonghuId"});//把级联的数据添加到view中,并排除id和创建时间字段,当前表的级联注册表
            view.setYonghuId(yonghu.getId());
            }
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view, request);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody BanshishenqingEntity banshishenqing, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,banshishenqing:{}",this.getClass().getName(),banshishenqing.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永远不会进入");
        else if("用户".equals(role))
            banshishenqing.setYonghuId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));

        Wrapper<BanshishenqingEntity> queryWrapper = new EntityWrapper<BanshishenqingEntity>()
            .eq("yonghu_id", banshishenqing.getYonghuId())
            .eq("banshishenqing_name", banshishenqing.getBanshishenqingName())
            .eq("banshi_types", banshishenqing.getBanshiTypes())
            .eq("shenqingbanshi_time", new SimpleDateFormat("yyyy-MM-dd").format(banshishenqing.getShenqingbanshiTime()))
            .in("banshishenqing_yesno_types", new Integer[]{1,2})
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        BanshishenqingEntity banshishenqingEntity = banshishenqingService.selectOne(queryWrapper);
        if(banshishenqingEntity==null){
            banshishenqing.setInsertTime(new Date());
            banshishenqing.setBanshishenqingYesnoTypes(1);
            banshishenqing.setCreateTime(new Date());
            banshishenqingService.insert(banshishenqing);
            return R.ok();
        }else {
            if(banshishenqingEntity.getBanshishenqingYesnoTypes()==1)
                return R.error(511,"有相同的待审核的数据");
            else if(banshishenqingEntity.getBanshishenqingYesnoTypes()==2)
                return R.error(511,"有相同的审核通过的数据");
            else
                return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody BanshishenqingEntity banshishenqing, HttpServletRequest request) throws NoSuchFieldException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        logger.debug("update方法:,,Controller:{},,banshishenqing:{}",this.getClass().getName(),banshishenqing.toString());
        BanshishenqingEntity oldBanshishenqingEntity = banshishenqingService.selectById(banshishenqing.getId());//查询原先数据

        String role = String.valueOf(request.getSession().getAttribute("role"));
//        if(false)
//            return R.error(511,"永远不会进入");
//        else if("用户".equals(role))
//            banshishenqing.setYonghuId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));

            banshishenqingService.updateById(banshishenqing);//根据id更新
            return R.ok();
    }


    /**
    * 审核
    */
    @RequestMapping("/shenhe")
    public R shenhe(@RequestBody BanshishenqingEntity banshishenqingEntity, HttpServletRequest request){
        logger.debug("shenhe方法:,,Controller:{},,banshishenqingEntity:{}",this.getClass().getName(),banshishenqingEntity.toString());

        BanshishenqingEntity oldBanshishenqing = banshishenqingService.selectById(banshishenqingEntity.getId());//查询原先数据

//        if(banshishenqingEntity.getBanshishenqingYesnoTypes() == 2){//通过
//            banshishenqingEntity.setBanshishenqingTypes();
//        }else if(banshishenqingEntity.getBanshishenqingYesnoTypes() == 3){//拒绝
//            banshishenqingEntity.setBanshishenqingTypes();
//        }
        banshishenqingEntity.setBanshishenqingShenheTime(new Date());//审核时间
        banshishenqingService.updateById(banshishenqingEntity);//审核

        return R.ok();
    }

    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids, HttpServletRequest request){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        List<BanshishenqingEntity> oldBanshishenqingList =banshishenqingService.selectBatchIds(Arrays.asList(ids));//要删除的数据
        banshishenqingService.deleteBatchIds(Arrays.asList(ids));

        return R.ok();
    }


    /**
     * 批量上传
     */
    @RequestMapping("/batchInsert")
    public R save( String fileName, HttpServletRequest request){
        logger.debug("batchInsert方法:,,Controller:{},,fileName:{}",this.getClass().getName(),fileName);
        Integer yonghuId = Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId")));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            List<BanshishenqingEntity> banshishenqingList = new ArrayList<>();//上传的东西
            Map<String, List<String>> seachFields= new HashMap<>();//要查询的字段
            Date date = new Date();
            int lastIndexOf = fileName.lastIndexOf(".");
            if(lastIndexOf == -1){
                return R.error(511,"该文件没有后缀");
            }else{
                String suffix = fileName.substring(lastIndexOf);
                if(!".xls".equals(suffix)){
                    return R.error(511,"只支持后缀为xls的excel文件");
                }else{
                    URL resource = this.getClass().getClassLoader().getResource("static/upload/" + fileName);//获取文件路径
                    File file = new File(resource.getFile());
                    if(!file.exists()){
                        return R.error(511,"找不到上传文件，请联系管理员");
                    }else{
                        List<List<String>> dataList = PoiUtil.poiImport(file.getPath());//读取xls文件
                        dataList.remove(0);//删除第一行，因为第一行是提示
                        for(List<String> data:dataList){
                            //循环
                            BanshishenqingEntity banshishenqingEntity = new BanshishenqingEntity();
//                            banshishenqingEntity.setYonghuId(Integer.valueOf(data.get(0)));   //用户 要改的
//                            banshishenqingEntity.setBanshishenqingName(data.get(0));                    //申请办事标题 要改的
//                            banshishenqingEntity.setBanshishenqingUuidNumber(data.get(0));                    //办事申请编号 要改的
//                            banshishenqingEntity.setBanshiTypes(Integer.valueOf(data.get(0)));   //办事类型 要改的
//                            banshishenqingEntity.setShenqingbanshiTime(sdf.parse(data.get(0)));          //申请办事日期 要改的
//                            banshishenqingEntity.setBanshishenqingContent("");//详情和图片
//                            banshishenqingEntity.setInsertTime(date);//时间
//                            banshishenqingEntity.setBanshishenqingYesnoTypes(Integer.valueOf(data.get(0)));   //申请状态 要改的
//                            banshishenqingEntity.setBanshishenqingYesnoText(data.get(0));                    //审核意见 要改的
//                            banshishenqingEntity.setBanshishenqingShenheTime(sdf.parse(data.get(0)));          //审核时间 要改的
//                            banshishenqingEntity.setCreateTime(date);//时间
                            banshishenqingList.add(banshishenqingEntity);


                            //把要查询是否重复的字段放入map中
                                //办事申请编号
                                if(seachFields.containsKey("banshishenqingUuidNumber")){
                                    List<String> banshishenqingUuidNumber = seachFields.get("banshishenqingUuidNumber");
                                    banshishenqingUuidNumber.add(data.get(0));//要改的
                                }else{
                                    List<String> banshishenqingUuidNumber = new ArrayList<>();
                                    banshishenqingUuidNumber.add(data.get(0));//要改的
                                    seachFields.put("banshishenqingUuidNumber",banshishenqingUuidNumber);
                                }
                        }

                        //查询是否重复
                         //办事申请编号
                        List<BanshishenqingEntity> banshishenqingEntities_banshishenqingUuidNumber = banshishenqingService.selectList(new EntityWrapper<BanshishenqingEntity>().in("banshishenqing_uuid_number", seachFields.get("banshishenqingUuidNumber")));
                        if(banshishenqingEntities_banshishenqingUuidNumber.size() >0 ){
                            ArrayList<String> repeatFields = new ArrayList<>();
                            for(BanshishenqingEntity s:banshishenqingEntities_banshishenqingUuidNumber){
                                repeatFields.add(s.getBanshishenqingUuidNumber());
                            }
                            return R.error(511,"数据库的该表中的 [办事申请编号] 字段已经存在 存在数据为:"+repeatFields.toString());
                        }
                        banshishenqingService.insertBatch(banshishenqingList);
                        return R.ok();
                    }
                }
            }
        }catch (Exception e){
            e.printStackTrace();
            return R.error(511,"批量插入数据异常，请联系管理员");
        }
    }




    /**
    * 前端列表
    */
    @IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("list方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));

        CommonUtil.checkMap(params);
        PageUtils page = banshishenqingService.queryPage(params);

        //字典表数据转换
        List<BanshishenqingView> list =(List<BanshishenqingView>)page.getList();
        for(BanshishenqingView c:list)
            dictionaryService.dictionaryConvert(c, request); //修改对应字典表字段

        return R.ok().put("data", page);
    }

    /**
    * 前端详情
    */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("detail方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        BanshishenqingEntity banshishenqing = banshishenqingService.selectById(id);
            if(banshishenqing !=null){


                //entity转view
                BanshishenqingView view = new BanshishenqingView();
                BeanUtils.copyProperties( banshishenqing , view );//把实体数据重构到view中

                //级联表
                    YonghuEntity yonghu = yonghuService.selectById(banshishenqing.getYonghuId());
                if(yonghu != null){
                    BeanUtils.copyProperties( yonghu , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setYonghuId(yonghu.getId());
                }
                //修改对应字典表字段
                dictionaryService.dictionaryConvert(view, request);
                return R.ok().put("data", view);
            }else {
                return R.error(511,"查不到数据");
            }
    }


    /**
    * 前端保存
    */
    @RequestMapping("/add")
    public R add(@RequestBody BanshishenqingEntity banshishenqing, HttpServletRequest request){
        logger.debug("add方法:,,Controller:{},,banshishenqing:{}",this.getClass().getName(),banshishenqing.toString());
        Wrapper<BanshishenqingEntity> queryWrapper = new EntityWrapper<BanshishenqingEntity>()
            .eq("yonghu_id", banshishenqing.getYonghuId())
            .eq("banshishenqing_name", banshishenqing.getBanshishenqingName())
            .eq("banshishenqing_uuid_number", banshishenqing.getBanshishenqingUuidNumber())
            .eq("banshi_types", banshishenqing.getBanshiTypes())
            .in("banshishenqing_yesno_types", new Integer[]{1,2})
            .eq("banshishenqing_yesno_text", banshishenqing.getBanshishenqingYesnoText())
//            .notIn("banshishenqing_types", new Integer[]{102})
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        BanshishenqingEntity banshishenqingEntity = banshishenqingService.selectOne(queryWrapper);
        if(banshishenqingEntity==null){
            banshishenqing.setInsertTime(new Date());
            banshishenqing.setBanshishenqingYesnoTypes(1);
            banshishenqing.setCreateTime(new Date());
        banshishenqingService.insert(banshishenqing);

            return R.ok();
        }else {
            if(banshishenqingEntity.getBanshishenqingYesnoTypes()==1)
                return R.error(511,"有相同的待审核的数据");
            else if(banshishenqingEntity.getBanshishenqingYesnoTypes()==2)
                return R.error(511,"有相同的审核通过的数据");
            else
                return R.error(511,"表中有相同数据");
        }
    }

}

