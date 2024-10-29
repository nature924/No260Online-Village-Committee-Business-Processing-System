package com.entity;

import com.annotation.ColumnInfo;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;
import java.io.Serializable;
import java.util.*;
import org.apache.tools.ant.util.DateUtils;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.utils.DateUtil;


/**
 * 补贴活动通告
 *
 * @author 
 * @email
 */
@TableName("butiehuodong")
public class ButiehuodongEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ButiehuodongEntity() {

	}

	public ButiehuodongEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @ColumnInfo(comment="主键",type="int(11)")
    @TableField(value = "id")

    private Integer id;


    /**
     * 补贴活动通告名称
     */
    @ColumnInfo(comment="补贴活动通告名称",type="varchar(200)")
    @TableField(value = "butiehuodong_name")

    private String butiehuodongName;


    /**
     * 补贴活动通告图片
     */
    @ColumnInfo(comment="补贴活动通告图片",type="varchar(200)")
    @TableField(value = "butiehuodong_photo")

    private String butiehuodongPhoto;


    /**
     * 补贴活动通告类型
     */
    @ColumnInfo(comment="补贴活动通告类型",type="int(11)")
    @TableField(value = "butiehuodong_types")

    private Integer butiehuodongTypes;


    /**
     * 补贴活动通告发布时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="补贴活动通告发布时间",type="timestamp")
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 补贴活动通告内容
     */
    @ColumnInfo(comment="补贴活动通告内容",type="text")
    @TableField(value = "butiehuodong_content")

    private String butiehuodongContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="创建时间",type="timestamp")
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 设置：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：补贴活动通告名称
	 */
    public String getButiehuodongName() {
        return butiehuodongName;
    }
    /**
	 * 设置：补贴活动通告名称
	 */

    public void setButiehuodongName(String butiehuodongName) {
        this.butiehuodongName = butiehuodongName;
    }
    /**
	 * 获取：补贴活动通告图片
	 */
    public String getButiehuodongPhoto() {
        return butiehuodongPhoto;
    }
    /**
	 * 设置：补贴活动通告图片
	 */

    public void setButiehuodongPhoto(String butiehuodongPhoto) {
        this.butiehuodongPhoto = butiehuodongPhoto;
    }
    /**
	 * 获取：补贴活动通告类型
	 */
    public Integer getButiehuodongTypes() {
        return butiehuodongTypes;
    }
    /**
	 * 设置：补贴活动通告类型
	 */

    public void setButiehuodongTypes(Integer butiehuodongTypes) {
        this.butiehuodongTypes = butiehuodongTypes;
    }
    /**
	 * 获取：补贴活动通告发布时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 设置：补贴活动通告发布时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：补贴活动通告内容
	 */
    public String getButiehuodongContent() {
        return butiehuodongContent;
    }
    /**
	 * 设置：补贴活动通告内容
	 */

    public void setButiehuodongContent(String butiehuodongContent) {
        this.butiehuodongContent = butiehuodongContent;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 设置：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Butiehuodong{" +
            ", id=" + id +
            ", butiehuodongName=" + butiehuodongName +
            ", butiehuodongPhoto=" + butiehuodongPhoto +
            ", butiehuodongTypes=" + butiehuodongTypes +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", butiehuodongContent=" + butiehuodongContent +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
