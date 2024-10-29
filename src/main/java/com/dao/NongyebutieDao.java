package com.dao;

import com.entity.NongyebutieEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.NongyebutieView;

/**
 * 农业补贴 Dao 接口
 *
 * @author 
 */
public interface NongyebutieDao extends BaseMapper<NongyebutieEntity> {

   List<NongyebutieView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
