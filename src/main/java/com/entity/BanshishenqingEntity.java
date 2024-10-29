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
 * 办事申请
 *
 * @author 
 * @email
 */
@TableName("banshishenqing")
public class BanshishenqingEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public BanshishenqingEntity() {

	}

	public BanshishenqingEntity(T t) {
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
     * 用户
     */
    @ColumnInfo(comment="用户",type="int(11)")
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 申请办事标题
     */
    @ColumnInfo(comment="申请办事标题",type="varchar(200)")
    @TableField(value = "banshishenqing_name")

    private String banshishenqingName;


    /**
     * 办事申请编号
     */
    @ColumnInfo(comment="办事申请编号",type="varchar(200)")
    @TableField(value = "banshishenqing_uuid_number")

    private String banshishenqingUuidNumber;


    /**
     * 办事类型
     */
    @ColumnInfo(comment="办事类型",type="int(11)")
    @TableField(value = "banshi_types")

    private Integer banshiTypes;


    /**
     * 申请办事日期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat
    @ColumnInfo(comment="申请办事日期",type="date")
    @TableField(value = "shenqingbanshi_time")

    private Date shenqingbanshiTime;


    /**
     * 申请办事详情
     */
    @ColumnInfo(comment="申请办事详情",type="text")
    @TableField(value = "banshishenqing_content")

    private String banshishenqingContent;


    /**
     * 申请时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="申请时间",type="timestamp")
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 申请状态
     */
    @ColumnInfo(comment="申请状态",type="int(11)")
    @TableField(value = "banshishenqing_yesno_types")

    private Integer banshishenqingYesnoTypes;


    /**
     * 审核意见
     */
    @ColumnInfo(comment="审核意见",type="text")
    @TableField(value = "banshishenqing_yesno_text")

    private String banshishenqingYesnoText;


    /**
     * 审核时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="审核时间",type="timestamp")
    @TableField(value = "banshishenqing_shenhe_time")

    private Date banshishenqingShenheTime;


    /**
     * 创建时间   listShow
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
	 * 获取：创建时间   listShow
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 设置：创建时间   listShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Banshishenqing{" +
            ", id=" + id +
            ", yonghuId=" + yonghuId +
            ", banshishenqingName=" + banshishenqingName +
            ", banshishenqingUuidNumber=" + banshishenqingUuidNumber +
            ", banshiTypes=" + banshiTypes +
            ", shenqingbanshiTime=" + DateUtil.convertString(shenqingbanshiTime,"yyyy-MM-dd") +
            ", banshishenqingContent=" + banshishenqingContent +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", banshishenqingYesnoTypes=" + banshishenqingYesnoTypes +
            ", banshishenqingYesnoText=" + banshishenqingYesnoText +
            ", banshishenqingShenheTime=" + DateUtil.convertString(banshishenqingShenheTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
