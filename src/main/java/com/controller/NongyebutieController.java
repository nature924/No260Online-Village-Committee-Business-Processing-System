
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
 * 农业补贴
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/nongyebutie")
public class NongyebutieController {
    private static final Logger logger = LoggerFactory.getLogger(NongyebutieController.class);

    private static final String TABLE_NAME = "nongyebutie";

    @Autowired
    private NongyebutieService nongyebutieService;


    @Autowired
    private TokenService tokenService;

    @Autowired
    private BanshijiluService banshijiluService;//办事记录
    @Autowired
    private BanshishenqingService banshishenqingService;//办事申请
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
        PageUtils page = nongyebutieService.queryPage(params);

        //字典表数据转换
        List<NongyebutieView> list =(List<NongyebutieView>)page.getList();
        for(NongyebutieView c:list){
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
        NongyebutieEntity nongyebutie = nongyebutieService.selectById(id);
        if(nongyebutie !=null){
            //entity转view
            NongyebutieView view = new NongyebutieView();
            BeanUtils.copyProperties( nongyebutie , view );//把实体数据重构到view中
            //级联表 用户
            //级联表
            YonghuEntity yonghu = yonghuService.selectById(nongyebutie.getYonghuId());
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
    public R save(@RequestBody NongyebutieEntity nongyebutie, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,nongyebutie:{}",this.getClass().getName(),nongyebutie.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永远不会进入");
        else if("用户".equals(role))
            nongyebutie.setYonghuId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));

        Wrapper<NongyebutieEntity> queryWrapper = new EntityWrapper<NongyebutieEntity>()
            .eq("yonghu_id", nongyebutie.getYonghuId())
            .eq("nongyebutie_name", nongyebutie.getNongyebutieName())
            .eq("nongyebutie_types", nongyebutie.getNongyebutieTypes())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        NongyebutieEntity nongyebutieEntity = nongyebutieService.selectOne(queryWrapper);
        if(nongyebutieEntity==null){
            nongyebutie.setInsertTime(new Date());
            nongyebutie.setCreateTime(new Date());
            nongyebutieService.insert(nongyebutie);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody NongyebutieEntity nongyebutie, HttpServletRequest request) throws NoSuchFieldException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        logger.debug("update方法:,,Controller:{},,nongyebutie:{}",this.getClass().getName(),nongyebutie.toString());
        NongyebutieEntity oldNongyebutieEntity = nongyebutieService.selectById(nongyebutie.getId());//查询原先数据

        String role = String.valueOf(request.getSession().getAttribute("role"));
//        if(false)
//            return R.error(511,"永远不会进入");
//        else if("用户".equals(role))
//            nongyebutie.setYonghuId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));

            nongyebutieService.updateById(nongyebutie);//根据id更新
            return R.ok();
    }



    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids, HttpServletRequest request){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        List<NongyebutieEntity> oldNongyebutieList =nongyebutieService.selectBatchIds(Arrays.asList(ids));//要删除的数据
        nongyebutieService.deleteBatchIds(Arrays.asList(ids));

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
            List<NongyebutieEntity> nongyebutieList = new ArrayList<>();//上传的东西
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
                            NongyebutieEntity nongyebutieEntity = new NongyebutieEntity();
//                            nongyebutieEntity.setYonghuId(Integer.valueOf(data.get(0)));   //用户 要改的
//                            nongyebutieEntity.setNongyebutieUuidNumber(data.get(0));                    //农业补贴编号 要改的
//                            nongyebutieEntity.setNongyebutieName(data.get(0));                    //农业补贴标题 要改的
//                            nongyebutieEntity.setNongyebutieTypes(Integer.valueOf(data.get(0)));   //农业补贴类型 要改的
//                            nongyebutieEntity.setButieJine(data.get(0));                    //补贴金额 要改的
//                            nongyebutieEntity.setNongyebutieTime(sdf.parse(data.get(0)));          //补贴时间 要改的
//                            nongyebutieEntity.setNongyebutieContent("");//详情和图片
//                            nongyebutieEntity.setInsertTime(date);//时间
//                            nongyebutieEntity.setCreateTime(date);//时间
                            nongyebutieList.add(nongyebutieEntity);


                            //把要查询是否重复的字段放入map中
                                //农业补贴编号
                                if(seachFields.containsKey("nongyebutieUuidNumber")){
                                    List<String> nongyebutieUuidNumber = seachFields.get("nongyebutieUuidNumber");
                                    nongyebutieUuidNumber.add(data.get(0));//要改的
                                }else{
                                    List<String> nongyebutieUuidNumber = new ArrayList<>();
                                    nongyebutieUuidNumber.add(data.get(0));//要改的
                                    seachFields.put("nongyebutieUuidNumber",nongyebutieUuidNumber);
                                }
                        }

                        //查询是否重复
                         //农业补贴编号
                        List<NongyebutieEntity> nongyebutieEntities_nongyebutieUuidNumber = nongyebutieService.selectList(new EntityWrapper<NongyebutieEntity>().in("nongyebutie_uuid_number", seachFields.get("nongyebutieUuidNumber")));
                        if(nongyebutieEntities_nongyebutieUuidNumber.size() >0 ){
                            ArrayList<String> repeatFields = new ArrayList<>();
                            for(NongyebutieEntity s:nongyebutieEntities_nongyebutieUuidNumber){
                                repeatFields.add(s.getNongyebutieUuidNumber());
                            }
                            return R.error(511,"数据库的该表中的 [农业补贴编号] 字段已经存在 存在数据为:"+repeatFields.toString());
                        }
                        nongyebutieService.insertBatch(nongyebutieList);
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
        PageUtils page = nongyebutieService.queryPage(params);

        //字典表数据转换
        List<NongyebutieView> list =(List<NongyebutieView>)page.getList();
        for(NongyebutieView c:list)
            dictionaryService.dictionaryConvert(c, request); //修改对应字典表字段

        return R.ok().put("data", page);
    }

    /**
    * 前端详情
    */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("detail方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        NongyebutieEntity nongyebutie = nongyebutieService.selectById(id);
            if(nongyebutie !=null){


                //entity转view
                NongyebutieView view = new NongyebutieView();
                BeanUtils.copyProperties( nongyebutie , view );//把实体数据重构到view中

                //级联表
                    YonghuEntity yonghu = yonghuService.selectById(nongyebutie.getYonghuId());
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
    public R add(@RequestBody NongyebutieEntity nongyebutie, HttpServletRequest request){
        logger.debug("add方法:,,Controller:{},,nongyebutie:{}",this.getClass().getName(),nongyebutie.toString());
        Wrapper<NongyebutieEntity> queryWrapper = new EntityWrapper<NongyebutieEntity>()
            .eq("yonghu_id", nongyebutie.getYonghuId())
            .eq("nongyebutie_uuid_number", nongyebutie.getNongyebutieUuidNumber())
            .eq("nongyebutie_name", nongyebutie.getNongyebutieName())
            .eq("nongyebutie_types", nongyebutie.getNongyebutieTypes())
//            .notIn("nongyebutie_types", new Integer[]{102})
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        NongyebutieEntity nongyebutieEntity = nongyebutieService.selectOne(queryWrapper);
        if(nongyebutieEntity==null){
            nongyebutie.setInsertTime(new Date());
            nongyebutie.setCreateTime(new Date());
        nongyebutieService.insert(nongyebutie);

            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

}

