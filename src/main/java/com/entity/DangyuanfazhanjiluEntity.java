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
 * 党员发展
 *
 * @author 
 * @email
 */
@TableName("dangyuanfazhanjilu")
public class DangyuanfazhanjiluEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public DangyuanfazhanjiluEntity() {

	}

	public DangyuanfazhanjiluEntity(T t) {
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
     * 党员发展编号
     */
    @ColumnInfo(comment="党员发展编号",type="varchar(200)")
    @TableField(value = "dangyuanfazhanjilu_uuid_number")

    private String dangyuanfazhanjiluUuidNumber;


    /**
     * 发展标题
     */
    @ColumnInfo(comment="发展标题",type="varchar(200)")
    @TableField(value = "dangyuanfazhanjilu_name")

    private String dangyuanfazhanjiluName;


    /**
     * 入党文件
     */
    @ColumnInfo(comment="入党文件",type="varchar(200)")
    @TableField(value = "dangyuanfazhanjilu_file")

    private String dangyuanfazhanjiluFile;


    /**
     * 入党宣誓视频
     */
    @ColumnInfo(comment="入党宣誓视频",type="varchar(200)")
    @TableField(value = "dangyuanfazhanjilu_video")

    private String dangyuanfazhanjiluVideo;


    /**
     * 发展类型
     */
    @ColumnInfo(comment="发展类型",type="int(11)")
    @TableField(value = "dangyuanfazhanjilu_types")

    private Integer dangyuanfazhanjiluTypes;


    /**
     * 发展时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="发展时间",type="timestamp")
    @TableField(value = "fazhan_time")

    private Date fazhanTime;


    /**
     * 发展备注
     */
    @ColumnInfo(comment="发展备注",type="text")
    @TableField(value = "dangyuanfazhanjilu_content")

    private String dangyuanfazhanjiluContent;


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
	 * 获取：党员发展编号
	 */
    public String getDangyuanfazhanjiluUuidNumber() {
        return dangyuanfazhanjiluUuidNumber;
    }
    /**
	 * 设置：党员发展编号
	 */

    public void setDangyuanfazhanjiluUuidNumber(String dangyuanfazhanjiluUuidNumber) {
        this.dangyuanfazhanjiluUuidNumber = dangyuanfazhanjiluUuidNumber;
    }
    /**
	 * 获取：发展标题
	 */
    public String getDangyuanfazhanjiluName() {
        return dangyuanfazhanjiluName;
    }
    /**
	 * 设置：发展标题
	 */

    public void setDangyuanfazhanjiluName(String dangyuanfazhanjiluName) {
        this.dangyuanfazhanjiluName = dangyuanfazhanjiluName;
    }
    /**
	 * 获取：入党文件
	 */
    public String getDangyuanfazhanjiluFile() {
        return dangyuanfazhanjiluFile;
    }
    /**
	 * 设置：入党文件
	 */

    public void setDangyuanfazhanjiluFile(String dangyuanfazhanjiluFile) {
        this.dangyuanfazhanjiluFile = dangyuanfazhanjiluFile;
    }
    /**
	 * 获取：入党宣誓视频
	 */
    public String getDangyuanfazhanjiluVideo() {
        return dangyuanfazhanjiluVideo;
    }
    /**
	 * 设置：入党宣誓视频
	 */

    public void setDangyuanfazhanjiluVideo(String dangyuanfazhanjiluVideo) {
        this.dangyuanfazhanjiluVideo = dangyuanfazhanjiluVideo;
    }
    /**
	 * 获取：发展类型
	 */
    public Integer getDangyuanfazhanjiluTypes() {
        return dangyuanfazhanjiluTypes;
    }
    /**
	 * 设置：发展类型
	 */

    public void setDangyuanfazhanjiluTypes(Integer dangyuanfazhanjiluTypes) {
        this.dangyuanfazhanjiluTypes = dangyuanfazhanjiluTypes;
    }
    /**
	 * 获取：发展时间
	 */
    public Date getFazhanTime() {
        return fazhanTime;
    }
    /**
	 * 设置：发展时间
	 */

    public void setFazhanTime(Date fazhanTime) {
        this.fazhanTime = fazhanTime;
    }
    /**
	 * 获取：发展备注
	 */
    public String getDangyuanfazhanjiluContent() {
        return dangyuanfazhanjiluContent;
    }
    /**
	 * 设置：发展备注
	 */

    public void setDangyuanfazhanjiluContent(String dangyuanfazhanjiluContent) {
        this.dangyuanfazhanjiluContent = dangyuanfazhanjiluContent;
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
        return "Dangyuanfazhanjilu{" +
            ", id=" + id +
            ", yonghuId=" + yonghuId +
            ", dangyuanfazhanjiluUuidNumber=" + dangyuanfazhanjiluUuidNumber +
            ", dangyuanfazhanjiluName=" + dangyuanfazhanjiluName +
            ", dangyuanfazhanjiluFile=" + dangyuanfazhanjiluFile +
            ", dangyuanfazhanjiluVideo=" + dangyuanfazhanjiluVideo +
            ", dangyuanfazhanjiluTypes=" + dangyuanfazhanjiluTypes +
            ", fazhanTime=" + DateUtil.convertString(fazhanTime,"yyyy-MM-dd") +
            ", dangyuanfazhanjiluContent=" + dangyuanfazhanjiluContent +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
