package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.YonghuEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 用户
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("yonghu")
public class YonghuView extends YonghuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表
	/**
	* 性别的值
	*/
	@ColumnInfo(comment="性别的字典表值",type="varchar(200)")
	private String sexValue;
	/**
	* 文化程度的值
	*/
	@ColumnInfo(comment="文化程度的字典表值",type="varchar(200)")
	private String wenhuaValue;
	/**
	* 政治面貌的值
	*/
	@ColumnInfo(comment="政治面貌的字典表值",type="varchar(200)")
	private String zhuangtaiValue;




	public YonghuView() {

	}

	public YonghuView(YonghuEntity yonghuEntity) {
		try {
			BeanUtils.copyProperties(this, yonghuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	//当前表的
	/**
	* 获取： 性别的值
	*/
	public String getSexValue() {
		return sexValue;
	}
	/**
	* 设置： 性别的值
	*/
	public void setSexValue(String sexValue) {
		this.sexValue = sexValue;
	}
	//当前表的
	/**
	* 获取： 文化程度的值
	*/
	public String getWenhuaValue() {
		return wenhuaValue;
	}
	/**
	* 设置： 文化程度的值
	*/
	public void setWenhuaValue(String wenhuaValue) {
		this.wenhuaValue = wenhuaValue;
	}
	//当前表的
	/**
	* 获取： 政治面貌的值
	*/
	public String getZhuangtaiValue() {
		return zhuangtaiValue;
	}
	/**
	* 设置： 政治面貌的值
	*/
	public void setZhuangtaiValue(String zhuangtaiValue) {
		this.zhuangtaiValue = zhuangtaiValue;
	}




	@Override
	public String toString() {
		return "YonghuView{" +
			", sexValue=" + sexValue +
			", wenhuaValue=" + wenhuaValue +
			", zhuangtaiValue=" + zhuangtaiValue +
			"} " + super.toString();
	}
}
