package com.entity.vo;

import com.entity.ButiehuodongEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 补贴活动通告
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("butiehuodong")
public class ButiehuodongVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 补贴活动通告名称
     */

    @TableField(value = "butiehuodong_name")
    private String butiehuodongName;


    /**
     * 补贴活动通告图片
     */

    @TableField(value = "butiehuodong_photo")
    private String butiehuodongPhoto;


    /**
     * 补贴活动通告类型
     */

    @TableField(value = "butiehuodong_types")
    private Integer butiehuodongTypes;


    /**
     * 补贴活动通告发布时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 补贴活动通告内容
     */

    @TableField(value = "butiehuodong_content")
    private String butiehuodongContent;


    /**
     * 创建时间 show1 show2 nameShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：补贴活动通告名称
	 */
    public String getButiehuodongName() {
        return butiehuodongName;
    }


    /**
	 * 获取：补贴活动通告名称
	 */

    public void setButiehuodongName(String butiehuodongName) {
        this.butiehuodongName = butiehuodongName;
    }
    /**
	 * 设置：补贴活动通告图片
	 */
    public String getButiehuodongPhoto() {
        return butiehuodongPhoto;
    }


    /**
	 * 获取：补贴活动通告图片
	 */

    public void setButiehuodongPhoto(String butiehuodongPhoto) {
        this.butiehuodongPhoto = butiehuodongPhoto;
    }
    /**
	 * 设置：补贴活动通告类型
	 */
    public Integer getButiehuodongTypes() {
        return butiehuodongTypes;
    }


    /**
	 * 获取：补贴活动通告类型
	 */

    public void setButiehuodongTypes(Integer butiehuodongTypes) {
        this.butiehuodongTypes = butiehuodongTypes;
    }
    /**
	 * 设置：补贴活动通告发布时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：补贴活动通告发布时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：补贴活动通告内容
	 */
    public String getButiehuodongContent() {
        return butiehuodongContent;
    }


    /**
	 * 获取：补贴活动通告内容
	 */

    public void setButiehuodongContent(String butiehuodongContent) {
        this.butiehuodongContent = butiehuodongContent;
    }
    /**
	 * 设置：创建时间 show1 show2 nameShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 nameShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
