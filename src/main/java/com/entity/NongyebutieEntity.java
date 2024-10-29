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
 * 农业补贴
 *
 * @author 
 * @email
 */
@TableName("nongyebutie")
public class NongyebutieEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public NongyebutieEntity() {

	}

	public NongyebutieEntity(T t) {
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
     * 农业补贴编号
     */
    @ColumnInfo(comment="农业补贴编号",type="varchar(200)")
    @TableField(value = "nongyebutie_uuid_number")

    private String nongyebutieUuidNumber;


    /**
     * 农业补贴标题
     */
    @ColumnInfo(comment="农业补贴标题",type="varchar(200)")
    @TableField(value = "nongyebutie_name")

    private String nongyebutieName;


    /**
     * 农业补贴类型
     */
    @ColumnInfo(comment="农业补贴类型",type="int(11)")
    @TableField(value = "nongyebutie_types")

    private Integer nongyebutieTypes;


    /**
     * 补贴金额
     */
    @ColumnInfo(comment="补贴金额",type="decimal(10,2)")
    @TableField(value = "butie_jine")

    private Double butieJine;


    /**
     * 补贴时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="补贴时间",type="timestamp")
    @TableField(value = "nongyebutie_time")

    private Date nongyebutieTime;


    /**
     * 补贴内容
     */
    @ColumnInfo(comment="补贴内容",type="text")
    @TableField(value = "nongyebutie_content")

    private String nongyebutieContent;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="录入时间",type="timestamp")
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
	 * 获取：农业补贴编号
	 */
    public String getNongyebutieUuidNumber() {
        return nongyebutieUuidNumber;
    }
    /**
	 * 设置：农业补贴编号
	 */

    public void setNongyebutieUuidNumber(String nongyebutieUuidNumber) {
        this.nongyebutieUuidNumber = nongyebutieUuidNumber;
    }
    /**
	 * 获取：农业补贴标题
	 */
    public String getNongyebutieName() {
        return nongyebutieName;
    }
    /**
	 * 设置：农业补贴标题
	 */

    public void setNongyebutieName(String nongyebutieName) {
        this.nongyebutieName = nongyebutieName;
    }
    /**
	 * 获取：农业补贴类型
	 */
    public Integer getNongyebutieTypes() {
        return nongyebutieTypes;
    }
    /**
	 * 设置：农业补贴类型
	 */

    public void setNongyebutieTypes(Integer nongyebutieTypes) {
        this.nongyebutieTypes = nongyebutieTypes;
    }
    /**
	 * 获取：补贴金额
	 */
    public Double getButieJine() {
        return butieJine;
    }
    /**
	 * 设置：补贴金额
	 */

    public void setButieJine(Double butieJine) {
        this.butieJine = butieJine;
    }
    /**
	 * 获取：补贴时间
	 */
    public Date getNongyebutieTime() {
        return nongyebutieTime;
    }
    /**
	 * 设置：补贴时间
	 */

    public void setNongyebutieTime(Date nongyebutieTime) {
        this.nongyebutieTime = nongyebutieTime;
    }
    /**
	 * 获取：补贴内容
	 */
    public String getNongyebutieContent() {
        return nongyebutieContent;
    }
    /**
	 * 设置：补贴内容
	 */

    public void setNongyebutieContent(String nongyebutieContent) {
        this.nongyebutieContent = nongyebutieContent;
    }
    /**
	 * 获取：录入时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 设置：录入时间
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
        return "Nongyebutie{" +
            ", id=" + id +
            ", yonghuId=" + yonghuId +
            ", nongyebutieUuidNumber=" + nongyebutieUuidNumber +
            ", nongyebutieName=" + nongyebutieName +
            ", nongyebutieTypes=" + nongyebutieTypes +
            ", butieJine=" + butieJine +
            ", nongyebutieTime=" + DateUtil.convertString(nongyebutieTime,"yyyy-MM-dd") +
            ", nongyebutieContent=" + nongyebutieContent +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
