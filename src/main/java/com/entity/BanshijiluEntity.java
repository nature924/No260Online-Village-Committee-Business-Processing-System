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
 * 办事记录
 *
 * @author 
 * @email
 */
@TableName("banshijilu")
public class BanshijiluEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public BanshijiluEntity() {

	}

	public BanshijiluEntity(T t) {
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
     * 办事记录编号
     */
    @ColumnInfo(comment="办事记录编号",type="varchar(200)")
    @TableField(value = "banshijilu_uuid_number")

    private String banshijiluUuidNumber;


    /**
     * 办事标题
     */
    @ColumnInfo(comment="办事标题",type="varchar(200)")
    @TableField(value = "banshijilu_name")

    private String banshijiluName;


    /**
     * 办事类型
     */
    @ColumnInfo(comment="办事类型",type="int(11)")
    @TableField(value = "banshi_types")

    private Integer banshiTypes;


    /**
     * 办事时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="办事时间",type="timestamp")
    @TableField(value = "banshi_time")

    private Date banshiTime;


    /**
     * 办事内容
     */
    @ColumnInfo(comment="办事内容",type="text")
    @TableField(value = "banshijilu_content")

    private String banshijiluContent;


    /**
     * 办事结果
     */
    @ColumnInfo(comment="办事结果",type="int(11)")
    @TableField(value = "banshijieguo_types")

    private Integer banshijieguoTypes;


    /**
     * 居委会回复
     */
    @ColumnInfo(comment="居委会回复",type="text")
    @TableField(value = "juweihui_content")

    private String juweihuiContent;


    /**
     * 记录时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="记录时间",type="timestamp")
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


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
	 * 获取：办事记录编号
	 */
    public String getBanshijiluUuidNumber() {
        return banshijiluUuidNumber;
    }
    /**
	 * 设置：办事记录编号
	 */

    public void setBanshijiluUuidNumber(String banshijiluUuidNumber) {
        this.banshijiluUuidNumber = banshijiluUuidNumber;
    }
    /**
	 * 获取：办事标题
	 */
    public String getBanshijiluName() {
        return banshijiluName;
    }
    /**
	 * 设置：办事标题
	 */

    public void setBanshijiluName(String banshijiluName) {
        this.banshijiluName = banshijiluName;
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
	 * 获取：办事时间
	 */
    public Date getBanshiTime() {
        return banshiTime;
    }
    /**
	 * 设置：办事时间
	 */

    public void setBanshiTime(Date banshiTime) {
        this.banshiTime = banshiTime;
    }
    /**
	 * 获取：办事内容
	 */
    public String getBanshijiluContent() {
        return banshijiluContent;
    }
    /**
	 * 设置：办事内容
	 */

    public void setBanshijiluContent(String banshijiluContent) {
        this.banshijiluContent = banshijiluContent;
    }
    /**
	 * 获取：办事结果
	 */
    public Integer getBanshijieguoTypes() {
        return banshijieguoTypes;
    }
    /**
	 * 设置：办事结果
	 */

    public void setBanshijieguoTypes(Integer banshijieguoTypes) {
        this.banshijieguoTypes = banshijieguoTypes;
    }
    /**
	 * 获取：居委会回复
	 */
    public String getJuweihuiContent() {
        return juweihuiContent;
    }
    /**
	 * 设置：居委会回复
	 */

    public void setJuweihuiContent(String juweihuiContent) {
        this.juweihuiContent = juweihuiContent;
    }
    /**
	 * 获取：记录时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 设置：记录时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
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
        return "Banshijilu{" +
            ", id=" + id +
            ", yonghuId=" + yonghuId +
            ", banshijiluUuidNumber=" + banshijiluUuidNumber +
            ", banshijiluName=" + banshijiluName +
            ", banshiTypes=" + banshiTypes +
            ", banshiTime=" + DateUtil.convertString(banshiTime,"yyyy-MM-dd") +
            ", banshijiluContent=" + banshijiluContent +
            ", banshijieguoTypes=" + banshijieguoTypes +
            ", juweihuiContent=" + juweihuiContent +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
