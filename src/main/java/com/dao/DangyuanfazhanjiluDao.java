package com.dao;

import com.entity.DangyuanfazhanjiluEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.DangyuanfazhanjiluView;

/**
 * 党员发展 Dao 接口
 *
 * @author 
 */
public interface DangyuanfazhanjiluDao extends BaseMapper<DangyuanfazhanjiluEntity> {

   List<DangyuanfazhanjiluView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
