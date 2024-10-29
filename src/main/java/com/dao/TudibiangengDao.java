package com.dao;

import com.entity.TudibiangengEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.TudibiangengView;

/**
 * 土地变更 Dao 接口
 *
 * @author 
 */
public interface TudibiangengDao extends BaseMapper<TudibiangengEntity> {

   List<TudibiangengView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
