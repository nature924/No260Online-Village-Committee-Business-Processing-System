package com.entity.vo;

import com.entity.BanshishenqingEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 办事申请
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("banshishenqing")
public class BanshishenqingVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 用户
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 申请办事标题
     */

    @TableField(value = "banshishenqing_name")
    private String banshishenqingName;


    /**
     * 办事申请编号
     */

    @TableField(value = "banshishenqing_uuid_number")
    private String banshishenqingUuidNumber;


    /**
     * 办事类型
     */

    @TableField(value = "banshi_types")
    private Integer banshiTypes;


    /**
     * 申请办事日期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "shenqingbanshi_time")
    private Date shenqingbanshiTime;


    /**
     * 申请办事详情
     */

    @TableField(value = "banshishenqing_content")
    private String banshishenqingContent;


    /**
     * 申请时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 申请状态
     */

    @TableField(value = "banshishenqing_yesno_types")
    private Integer banshishenqingYesnoTypes;


    /**
     * 审核意见
     */

    @TableField(value = "banshishenqing_yesno_text")
    private String banshishenqingYesnoText;


    /**
     * 审核时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "banshishenqing_shenhe_time")
    private Date banshishenqingShenheTime;


    /**
     * 创建时间  show3 listShow
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
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：申请办事标题
	 */
    public String getBanshishenqingName() {
        return banshishenqingName;
    }


    /**
	 * 获取：申请办事标题
	 */

    public void setBanshishenqingName(String banshishenqingName) {
        this.banshishenqingName = banshishenqingName;
    }
    /**
	 * 设置：办事申请编号
	 */
    public String getBanshishenqingUuidNumber() {
        return banshishenqingUuidNumber;
    }


    /**
	 * 获取：办事申请编号
	 */

    public void setBanshishenqingUuidNumber(String banshishenqingUuidNumber) {
        this.banshishenqingUuidNumber = banshishenqingUuidNumber;
    }
    /**
	 * 设置：办事类型
	 */
    public Integer getBanshiTypes() {
        return banshiTypes;
    }


    /**
	 * 获取：办事类型
	 */

    public void setBanshiTypes(Integer banshiTypes) {
        this.banshiTypes = banshiTypes;
    }
    /**
	 * 设置：申请办事日期
	 */
    public Date getShenqingbanshiTime() {
        return shenqingbanshiTime;
    }


    /**
	 * 获取：申请办事日期
	 */

    public void setShenqingbanshiTime(Date shenqingbanshiTime) {
        this.shenqingbanshiTime = shenqingbanshiTime;
    }
    /**
	 * 设置：申请办事详情
	 */
    public String getBanshishenqingContent() {
        return banshishenqingContent;
    }


    /**
	 * 获取：申请办事详情
	 */

    public void setBanshishenqingContent(String banshishenqingContent) {
        this.banshishenqingContent = banshishenqingContent;
    }
    /**
	 * 设置：申请时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：申请时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：申请状态
	 */
    public Integer getBanshishenqingYesnoTypes() {
        return banshishenqingYesnoTypes;
    }


    /**
	 * 获取：申请状态
	 */

    public void setBanshishenqingYesnoTypes(Integer banshishenqingYesnoTypes) {
        this.banshishenqingYesnoTypes = banshishenqingYesnoTypes;
    }
    /**
	 * 设置：审核意见
	 */
    public String getBanshishenqingYesnoText() {
        return banshishenqingYesnoText;
    }


    /**
	 * 获取：审核意见
	 */

    public void setBanshishenqingYesnoText(String banshishenqingYesnoText) {
        this.banshishenqingYesnoText = banshishenqingYesnoText;
    }
    /**
	 * 设置：审核时间
	 */
    public Date getBanshishenqingShenheTime() {
        return banshishenqingShenheTime;
    }


    /**
	 * 获取：审核时间
	 */

    public void setBanshishenqingShenheTime(Date banshishenqingShenheTime) {
        this.banshishenqingShenheTime = banshishenqingShenheTime;
    }
    /**
	 * 设置：创建时间  show3 listShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间  show3 listShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
