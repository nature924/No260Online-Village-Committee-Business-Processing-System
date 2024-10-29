package com.entity.model;

import com.entity.NongyebutieEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 农业补贴
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class NongyebutieModel implements Serializable {
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
     * 农业补贴编号
     */
    private String nongyebutieUuidNumber;


    /**
     * 农业补贴标题
     */
    private String nongyebutieName;


    /**
     * 农业补贴类型
     */
    private Integer nongyebutieTypes;


    /**
     * 补贴金额
     */
    private Double butieJine;


    /**
     * 补贴时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date nongyebutieTime;


    /**
     * 补贴内容
     */
    private String nongyebutieContent;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


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
