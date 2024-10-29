package com.entity.model;

import com.entity.ButiehuodongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 补贴活动通告
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ButiehuodongModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 补贴活动通告名称
     */
    private String butiehuodongName;


    /**
     * 补贴活动通告图片
     */
    private String butiehuodongPhoto;


    /**
     * 补贴活动通告类型
     */
    private Integer butiehuodongTypes;


    /**
     * 补贴活动通告发布时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 补贴活动通告内容
     */
    private String butiehuodongContent;


    /**
     * 创建时间 show1 show2 nameShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
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
	 * 获取：创建时间 show1 show2 nameShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show1 show2 nameShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
