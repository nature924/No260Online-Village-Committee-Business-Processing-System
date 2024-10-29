package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.ButiehuodongEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 补贴活动通告
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("butiehuodong")
public class ButiehuodongView extends ButiehuodongEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表
	/**
	* 补贴活动通告类型的值
	*/
	@ColumnInfo(comment="补贴活动通告类型的字典表值",type="varchar(200)")
	private String butiehuodongValue;




	public ButiehuodongView() {

	}

	public ButiehuodongView(ButiehuodongEntity butiehuodongEntity) {
		try {
			BeanUtils.copyProperties(this, butiehuodongEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	//当前表的
	/**
	* 获取： 补贴活动通告类型的值
	*/
	public String getButiehuodongValue() {
		return butiehuodongValue;
	}
	/**
	* 设置： 补贴活动通告类型的值
	*/
	public void setButiehuodongValue(String butiehuodongValue) {
		this.butiehuodongValue = butiehuodongValue;
	}




	@Override
	public String toString() {
		return "ButiehuodongView{" +
			", butiehuodongValue=" + butiehuodongValue +
			"} " + super.toString();
	}
}
