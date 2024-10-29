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
 * 土地变更
 *
 * @author 
 * @email
 */
@TableName("tudibiangeng")
public class TudibiangengEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public TudibiangengEntity() {

	}

	public TudibiangengEntity(T t) {
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
     * 土地变更编号
     */
    @ColumnInfo(comment="土地变更编号",type="varchar(200)")
    @TableField(value = "tudibiangeng_uuid_number")

    private String tudibiangengUuidNumber;


    /**
     * 土地变更标题
     */
    @ColumnInfo(comment="土地变更标题",type="varchar(200)")
    @TableField(value = "tudibiangeng_name")

    private String tudibiangengName;


    /**
     * 土地变更类型
     */
    @ColumnInfo(comment="土地变更类型",type="int(11)")
    @TableField(value = "tudibiangeng_types")

    private Integer tudibiangengTypes;


    /**
     * 土地位置
     */
    @ColumnInfo(comment="土地位置",type="varchar(200)")
    @TableField(value = "tudibiangeng_address")

    private String tudibiangengAddress;


    /**
     * 变更时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="变更时间",type="timestamp")
    @TableField(value = "tudibiangeng_time")

    private Date tudibiangengTime;


    /**
     * 变更内容
     */
    @ColumnInfo(comment="变更内容",type="text")
    @TableField(value = "tudibiangeng_content")

    private String tudibiangengContent;


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
	 * 获取：土地变更编号
	 */
    public String getTudibiangengUuidNumber() {
        return tudibiangengUuidNumber;
    }
    /**
	 * 设置：土地变更编号
	 */

    public void setTudibiangengUuidNumber(String tudibiangengUuidNumber) {
        this.tudibiangengUuidNumber = tudibiangengUuidNumber;
    }
    /**
	 * 获取：土地变更标题
	 */
    public String getTudibiangengName() {
        return tudibiangengName;
    }
    /**
	 * 设置：土地变更标题
	 */

    public void setTudibiangengName(String tudibiangengName) {
        this.tudibiangengName = tudibiangengName;
    }
    /**
	 * 获取：土地变更类型
	 */
    public Integer getTudibiangengTypes() {
        return tudibiangengTypes;
    }
    /**
	 * 设置：土地变更类型
	 */

    public void setTudibiangengTypes(Integer tudibiangengTypes) {
        this.tudibiangengTypes = tudibiangengTypes;
    }
    /**
	 * 获取：土地位置
	 */
    public String getTudibiangengAddress() {
        return tudibiangengAddress;
    }
    /**
	 * 设置：土地位置
	 */

    public void setTudibiangengAddress(String tudibiangengAddress) {
        this.tudibiangengAddress = tudibiangengAddress;
    }
    /**
	 * 获取：变更时间
	 */
    public Date getTudibiangengTime() {
        return tudibiangengTime;
    }
    /**
	 * 设置：变更时间
	 */

    public void setTudibiangengTime(Date tudibiangengTime) {
        this.tudibiangengTime = tudibiangengTime;
    }
    /**
	 * 获取：变更内容
	 */
    public String getTudibiangengContent() {
        return tudibiangengContent;
    }
    /**
	 * 设置：变更内容
	 */

    public void setTudibiangengContent(String tudibiangengContent) {
        this.tudibiangengContent = tudibiangengContent;
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
        return "Tudibiangeng{" +
            ", id=" + id +
            ", yonghuId=" + yonghuId +
            ", tudibiangengUuidNumber=" + tudibiangengUuidNumber +
            ", tudibiangengName=" + tudibiangengName +
            ", tudibiangengTypes=" + tudibiangengTypes +
            ", tudibiangengAddress=" + tudibiangengAddress +
            ", tudibiangengTime=" + DateUtil.convertString(tudibiangengTime,"yyyy-MM-dd") +
            ", tudibiangengContent=" + tudibiangengContent +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
