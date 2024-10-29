
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
 * 党员发展
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/dangyuanfazhanjilu")
public class DangyuanfazhanjiluController {
    private static final Logger logger = LoggerFactory.getLogger(DangyuanfazhanjiluController.class);

    private static final String TABLE_NAME = "dangyuanfazhanjilu";

    @Autowired
    private DangyuanfazhanjiluService dangyuanfazhanjiluService;


    @Autowired
    private TokenService tokenService;

    @Autowired
    private BanshijiluService banshijiluService;//办事记录
    @Autowired
    private BanshishenqingService banshishenqingService;//办事申请
    @Autowired
    private ButiehuodongService butiehuodongService;//补贴活动通告
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
        PageUtils page = dangyuanfazhanjiluService.queryPage(params);

        //字典表数据转换
        List<DangyuanfazhanjiluView> list =(List<DangyuanfazhanjiluView>)page.getList();
        for(DangyuanfazhanjiluView c:list){
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
        DangyuanfazhanjiluEntity dangyuanfazhanjilu = dangyuanfazhanjiluService.selectById(id);
        if(dangyuanfazhanjilu !=null){
            //entity转view
            DangyuanfazhanjiluView view = new DangyuanfazhanjiluView();
            BeanUtils.copyProperties( dangyuanfazhanjilu , view );//把实体数据重构到view中
            //级联表 用户
            //级联表
            YonghuEntity yonghu = yonghuService.selectById(dangyuanfazhanjilu.getYonghuId());
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
    public R save(@RequestBody DangyuanfazhanjiluEntity dangyuanfazhanjilu, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,dangyuanfazhanjilu:{}",this.getClass().getName(),dangyuanfazhanjilu.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永远不会进入");
        else if("用户".equals(role))
            dangyuanfazhanjilu.setYonghuId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));


        YonghuEntity yonghuEntity = yonghuService.selectById(dangyuanfazhanjilu.getYonghuId());
        if(yonghuEntity==null)
            return R.error("查不到用户");
        if(yonghuEntity.getZhuangtaiTypes()==2)
            return R.error("当前用户已经是党员");
        yonghuEntity.setZhuangtaiTypes(2);
        yonghuService.updateById(yonghuEntity);

        dangyuanfazhanjilu.setInsertTime(new Date());
            dangyuanfazhanjilu.setCreateTime(new Date());
            dangyuanfazhanjiluService.insert(dangyuanfazhanjilu);
            return R.ok();
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody DangyuanfazhanjiluEntity dangyuanfazhanjilu, HttpServletRequest request) throws NoSuchFieldException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        logger.debug("update方法:,,Controller:{},,dangyuanfazhanjilu:{}",this.getClass().getName(),dangyuanfazhanjilu.toString());
        DangyuanfazhanjiluEntity oldDangyuanfazhanjiluEntity = dangyuanfazhanjiluService.selectById(dangyuanfazhanjilu.getId());//查询原先数据

        String role = String.valueOf(request.getSession().getAttribute("role"));
//        if(false)
//            return R.error(511,"永远不会进入");
//        else if("用户".equals(role))
//            dangyuanfazhanjilu.setYonghuId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));
        if("".equals(dangyuanfazhanjilu.getDangyuanfazhanjiluFile()) || "null".equals(dangyuanfazhanjilu.getDangyuanfazhanjiluFile())){
                dangyuanfazhanjilu.setDangyuanfazhanjiluFile(null);
        }
        if("".equals(dangyuanfazhanjilu.getDangyuanfazhanjiluVideo()) || "null".equals(dangyuanfazhanjilu.getDangyuanfazhanjiluVideo())){
                dangyuanfazhanjilu.setDangyuanfazhanjiluVideo(null);
        }

            dangyuanfazhanjiluService.updateById(dangyuanfazhanjilu);//根据id更新
            return R.ok();
    }



    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids, HttpServletRequest request){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        List<DangyuanfazhanjiluEntity> oldDangyuanfazhanjiluList =dangyuanfazhanjiluService.selectBatchIds(Arrays.asList(ids));//要删除的数据
        dangyuanfazhanjiluService.deleteBatchIds(Arrays.asList(ids));

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
            List<DangyuanfazhanjiluEntity> dangyuanfazhanjiluList = new ArrayList<>();//上传的东西
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
                            DangyuanfazhanjiluEntity dangyuanfazhanjiluEntity = new DangyuanfazhanjiluEntity();
//                            dangyuanfazhanjiluEntity.setYonghuId(Integer.valueOf(data.get(0)));   //用户 要改的
//                            dangyuanfazhanjiluEntity.setDangyuanfazhanjiluUuidNumber(data.get(0));                    //党员发展编号 要改的
//                            dangyuanfazhanjiluEntity.setDangyuanfazhanjiluName(data.get(0));                    //发展标题 要改的
//                            dangyuanfazhanjiluEntity.setDangyuanfazhanjiluFile(data.get(0));                    //入党文件 要改的
//                            dangyuanfazhanjiluEntity.setDangyuanfazhanjiluVideo(data.get(0));                    //入党宣誓视频 要改的
//                            dangyuanfazhanjiluEntity.setDangyuanfazhanjiluTypes(Integer.valueOf(data.get(0)));   //发展类型 要改的
//                            dangyuanfazhanjiluEntity.setFazhanTime(sdf.parse(data.get(0)));          //发展时间 要改的
//                            dangyuanfazhanjiluEntity.setDangyuanfazhanjiluContent("");//详情和图片
//                            dangyuanfazhanjiluEntity.setInsertTime(date);//时间
//                            dangyuanfazhanjiluEntity.setCreateTime(date);//时间
                            dangyuanfazhanjiluList.add(dangyuanfazhanjiluEntity);


                            //把要查询是否重复的字段放入map中
                                //党员发展编号
                                if(seachFields.containsKey("dangyuanfazhanjiluUuidNumber")){
                                    List<String> dangyuanfazhanjiluUuidNumber = seachFields.get("dangyuanfazhanjiluUuidNumber");
                                    dangyuanfazhanjiluUuidNumber.add(data.get(0));//要改的
                                }else{
                                    List<String> dangyuanfazhanjiluUuidNumber = new ArrayList<>();
                                    dangyuanfazhanjiluUuidNumber.add(data.get(0));//要改的
                                    seachFields.put("dangyuanfazhanjiluUuidNumber",dangyuanfazhanjiluUuidNumber);
                                }
                        }

                        //查询是否重复
                         //党员发展编号
                        List<DangyuanfazhanjiluEntity> dangyuanfazhanjiluEntities_dangyuanfazhanjiluUuidNumber = dangyuanfazhanjiluService.selectList(new EntityWrapper<DangyuanfazhanjiluEntity>().in("dangyuanfazhanjilu_uuid_number", seachFields.get("dangyuanfazhanjiluUuidNumber")));
                        if(dangyuanfazhanjiluEntities_dangyuanfazhanjiluUuidNumber.size() >0 ){
                            ArrayList<String> repeatFields = new ArrayList<>();
                            for(DangyuanfazhanjiluEntity s:dangyuanfazhanjiluEntities_dangyuanfazhanjiluUuidNumber){
                                repeatFields.add(s.getDangyuanfazhanjiluUuidNumber());
                            }
                            return R.error(511,"数据库的该表中的 [党员发展编号] 字段已经存在 存在数据为:"+repeatFields.toString());
                        }
                        dangyuanfazhanjiluService.insertBatch(dangyuanfazhanjiluList);
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
        PageUtils page = dangyuanfazhanjiluService.queryPage(params);

        //字典表数据转换
        List<DangyuanfazhanjiluView> list =(List<DangyuanfazhanjiluView>)page.getList();
        for(DangyuanfazhanjiluView c:list)
            dictionaryService.dictionaryConvert(c, request); //修改对应字典表字段

        return R.ok().put("data", page);
    }

    /**
    * 前端详情
    */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("detail方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        DangyuanfazhanjiluEntity dangyuanfazhanjilu = dangyuanfazhanjiluService.selectById(id);
            if(dangyuanfazhanjilu !=null){


                //entity转view
                DangyuanfazhanjiluView view = new DangyuanfazhanjiluView();
                BeanUtils.copyProperties( dangyuanfazhanjilu , view );//把实体数据重构到view中

                //级联表
                    YonghuEntity yonghu = yonghuService.selectById(dangyuanfazhanjilu.getYonghuId());
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
    public R add(@RequestBody DangyuanfazhanjiluEntity dangyuanfazhanjilu, HttpServletRequest request){
        logger.debug("add方法:,,Controller:{},,dangyuanfazhanjilu:{}",this.getClass().getName(),dangyuanfazhanjilu.toString());
        Wrapper<DangyuanfazhanjiluEntity> queryWrapper = new EntityWrapper<DangyuanfazhanjiluEntity>()
            .eq("yonghu_id", dangyuanfazhanjilu.getYonghuId())
            .eq("dangyuanfazhanjilu_uuid_number", dangyuanfazhanjilu.getDangyuanfazhanjiluUuidNumber())
            .eq("dangyuanfazhanjilu_name", dangyuanfazhanjilu.getDangyuanfazhanjiluName())
            .eq("dangyuanfazhanjilu_video", dangyuanfazhanjilu.getDangyuanfazhanjiluVideo())
            .eq("dangyuanfazhanjilu_types", dangyuanfazhanjilu.getDangyuanfazhanjiluTypes())
//            .notIn("dangyuanfazhanjilu_types", new Integer[]{102})
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        DangyuanfazhanjiluEntity dangyuanfazhanjiluEntity = dangyuanfazhanjiluService.selectOne(queryWrapper);
        if(dangyuanfazhanjiluEntity==null){
            dangyuanfazhanjilu.setInsertTime(new Date());
            dangyuanfazhanjilu.setCreateTime(new Date());
        dangyuanfazhanjiluService.insert(dangyuanfazhanjilu);

            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

}

