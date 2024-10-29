package com.dao;

import com.entity.ButiehuodongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ButiehuodongView;

/**
 * 补贴活动通告 Dao 接口
 *
 * @author 
 */
public interface ButiehuodongDao extends BaseMapper<ButiehuodongEntity> {

   List<ButiehuodongView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
