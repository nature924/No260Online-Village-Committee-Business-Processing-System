package com.entity.model;

import com.entity.TudibiangengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 土地变更
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class TudibiangengModel implements Serializable {
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
     * 土地变更编号
     */
    private String tudibiangengUuidNumber;


    /**
     * 土地变更标题
     */
    private String tudibiangengName;


    /**
     * 土地变更类型
     */
    private Integer tudibiangengTypes;


    /**
     * 土地位置
     */
    private String tudibiangengAddress;


    /**
     * 变更时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date tudibiangengTime;


    /**
     * 变更内容
     */
    private String tudibiangengContent;


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
