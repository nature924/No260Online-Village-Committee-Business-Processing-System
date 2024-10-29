package com.dao;

import com.entity.BanshijiluEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.BanshijiluView;

/**
 * 办事记录 Dao 接口
 *
 * @author 
 */
public interface BanshijiluDao extends BaseMapper<BanshijiluEntity> {

   List<BanshijiluView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
