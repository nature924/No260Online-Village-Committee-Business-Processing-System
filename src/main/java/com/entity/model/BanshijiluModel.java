package com.entity.model;

import com.entity.BanshijiluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 办事记录
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class BanshijiluModel implements Serializable {
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
     * 办事记录编号
     */
    private String banshijiluUuidNumber;


    /**
     * 办事标题
     */
    private String banshijiluName;


    /**
     * 办事类型
     */
    private Integer banshiTypes;


    /**
     * 办事时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date banshiTime;


    /**
     * 办事内容
     */
    private String banshijiluContent;


    /**
     * 办事结果
     */
    private Integer banshijieguoTypes;


    /**
     * 居委会回复
     */
    private String juweihuiContent;


    /**
     * 记录时间
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
