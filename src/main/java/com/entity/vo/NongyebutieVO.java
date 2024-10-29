package com.entity.vo;

import com.entity.NongyebutieEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 农业补贴
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("nongyebutie")
public class NongyebutieVO implements Serializable {
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
     * 农业补贴编号
     */

    @TableField(value = "nongyebutie_uuid_number")
    private String nongyebutieUuidNumber;


    /**
     * 农业补贴标题
     */

    @TableField(value = "nongyebutie_name")
    private String nongyebutieName;


    /**
     * 农业补贴类型
     */

    @TableField(value = "nongyebutie_types")
    private Integer nongyebutieTypes;


    /**
     * 补贴金额
     */

    @TableField(value = "butie_jine")
    private Double butieJine;


    /**
     * 补贴时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "nongyebutie_time")
    private Date nongyebutieTime;


    /**
     * 补贴内容
     */

    @TableField(value = "nongyebutie_content")
    private String nongyebutieContent;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


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
	 * 设置：农业补贴编号
	 */
    public String getNongyebutieUuidNumber() {
        return nongyebutieUuidNumber;
    }


    /**
	 * 获取：农业补贴编号
	 */

    public void setNongyebutieUuidNumber(String nongyebutieUuidNumber) {
        this.nongyebutieUuidNumber = nongyebutieUuidNumber;
    }
    /**
	 * 设置：农业补贴标题
	 */
    public String getNongyebutieName() {
        return nongyebutieName;
    }


    /**
	 * 获取：农业补贴标题
	 */

    public void setNongyebutieName(String nongyebutieName) {
        this.nongyebutieName = nongyebutieName;
    }
    /**
	 * 设置：农业补贴类型
	 */
    public Integer getNongyebutieTypes() {
        return nongyebutieTypes;
    }


    /**
	 * 获取：农业补贴类型
	 */

    public void setNongyebutieTypes(Integer nongyebutieTypes) {
        this.nongyebutieTypes = nongyebutieTypes;
    }
    /**
	 * 设置：补贴金额
	 */
    public Double getButieJine() {
        return butieJine;
    }


    /**
	 * 获取：补贴金额
	 */

    public void setButieJine(Double butieJine) {
        this.butieJine = butieJine;
    }
    /**
	 * 设置：补贴时间
	 */
    public Date getNongyebutieTime() {
        return nongyebutieTime;
    }


    /**
	 * 获取：补贴时间
	 */

    public void setNongyebutieTime(Date nongyebutieTime) {
        this.nongyebutieTime = nongyebutieTime;
    }
    /**
	 * 设置：补贴内容
	 */
    public String getNongyebutieContent() {
        return nongyebutieContent;
    }


    /**
	 * 获取：补贴内容
	 */

    public void setNongyebutieContent(String nongyebutieContent) {
        this.nongyebutieContent = nongyebutieContent;
    }
    /**
	 * 设置：录入时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：录入时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
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
