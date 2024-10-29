package com.service.impl;

import com.utils.StringUtil;
import com.service.DictionaryService;
import com.utils.ClazzDiff;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.lang.reflect.Field;
import java.util.*;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.transaction.annotation.Transactional;
import com.utils.PageUtils;
import com.utils.Query;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import org.springframework.lang.Nullable;
import org.springframework.util.Assert;
import com.dao.BanshishenqingDao;
import com.entity.BanshishenqingEntity;
import com.service.BanshishenqingService;
import com.entity.view.BanshishenqingView;

/**
 * 办事申请 服务实现类
 */
@Service("banshishenqingService")
@Transactional
public class BanshishenqingServiceImpl extends ServiceImpl<BanshishenqingDao, BanshishenqingEntity> implements BanshishenqingService {

    @Override
    public PageUtils queryPage(Map<String,Object> params) {
        Page<BanshishenqingView> page =new Query<BanshishenqingView>(params).getPage();
        page.setRecords(baseMapper.selectListView(page,params));
        return new PageUtils(page);
    }


}
