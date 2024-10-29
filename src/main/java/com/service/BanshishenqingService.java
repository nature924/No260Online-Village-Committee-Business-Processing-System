package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BanshishenqingEntity;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.lang.Nullable;
import java.util.List;

/**
 * 办事申请 服务类
 */
public interface BanshishenqingService extends IService<BanshishenqingEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);

}