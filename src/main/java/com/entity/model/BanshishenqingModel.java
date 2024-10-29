package com.entity.model;

import com.entity.BanshishenqingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 办事申请
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class BanshishenqingModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 申请办事标题
     */
    private String banshishenqingName;


    /**
     * 办事申请编号
     */
    private String banshishenqingUuidNumber;


    /**
     * 办事类型
     */
    private Integer banshiTypes;


    /**
     * 申请办事日期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date shenqingbanshiTime;


    /**
     * 申请办事详情
     */
    private String banshishenqingContent;


    /**
     * 申请时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 申请状态
     */
    private Integer banshishenqingYesnoTypes;


    /**
     * 审核意见
     */
    private String banshishenqingYesnoText;


    /**
     * 审核时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date banshishenqingShenheTime;


    /**
     * 创建时间  show3 listShow
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
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：申请办事标题
	 */
    public String getBanshishenqingName() {
        return banshishenqingName;
    }


    /**
	 * 设置：申请办事标题
	 */
    public void setBanshishenqingName(String banshishenqingName) {
        this.banshishenqingName = banshishenqingName;
    }
    /**
	 * 获取：办事申请编号
	 */
    public String getBanshishenqingUuidNumber() {
        return banshishenqingUuidNumber;
    }


    /**
	 * 设置：办事申请编号
	 */
    public void setBanshishenqingUuidNumber(String banshishenqingUuidNumber) {
        this.banshishenqingUuidNumber = banshishenqingUuidNumber;
    }
    /**
	 * 获取：办事类型
	 */
    public Integer getBanshiTypes() {
        return banshiTypes;
    }


    /**
	 * 设置：办事类型
	 */
    public void setBanshiTypes(Integer banshiTypes) {
        this.banshiTypes = banshiTypes;
    }
    /**
	 * 获取：申请办事日期
	 */
    public Date getShenqingbanshiTime() {
        return shenqingbanshiTime;
    }


    /**
	 * 设置：申请办事日期
	 */
    public void setShenqingbanshiTime(Date shenqingbanshiTime) {
        this.shenqingbanshiTime = shenqingbanshiTime;
    }
    /**
	 * 获取：申请办事详情
	 */
    public String getBanshishenqingContent() {
        return banshishenqingContent;
    }


    /**
	 * 设置：申请办事详情
	 */
    public void setBanshishenqingContent(String banshishenqingContent) {
        this.banshishenqingContent = banshishenqingContent;
    }
    /**
	 * 获取：申请时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：申请时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：申请状态
	 */
    public Integer getBanshishenqingYesnoTypes() {
        return banshishenqingYesnoTypes;
    }


    /**
	 * 设置：申请状态
	 */
    public void setBanshishenqingYesnoTypes(Integer banshishenqingYesnoTypes) {
        this.banshishenqingYesnoTypes = banshishenqingYesnoTypes;
    }
    /**
	 * 获取：审核意见
	 */
    public String getBanshishenqingYesnoText() {
        return banshishenqingYesnoText;
    }


    /**
	 * 设置：审核意见
	 */
    public void setBanshishenqingYesnoText(String banshishenqingYesnoText) {
        this.banshishenqingYesnoText = banshishenqingYesnoText;
    }
    /**
	 * 获取：审核时间
	 */
    public Date getBanshishenqingShenheTime() {
        return banshishenqingShenheTime;
    }


    /**
	 * 设置：审核时间
	 */
    public void setBanshishenqingShenheTime(Date banshishenqingShenheTime) {
        this.banshishenqingShenheTime = banshishenqingShenheTime;
    }
    /**
	 * 获取：创建时间  show3 listShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间  show3 listShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
