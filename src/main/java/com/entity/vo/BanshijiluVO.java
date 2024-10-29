package com.entity.vo;

import com.entity.BanshijiluEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 办事记录
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("banshijilu")
public class BanshijiluVO implements Serializable {
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
     * 办事记录编号
     */

    @TableField(value = "banshijilu_uuid_number")
    private String banshijiluUuidNumber;


    /**
     * 办事标题
     */

    @TableField(value = "banshijilu_name")
    private String banshijiluName;


    /**
     * 办事类型
     */

    @TableField(value = "banshi_types")
    private Integer banshiTypes;


    /**
     * 办事时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "banshi_time")
    private Date banshiTime;


    /**
     * 办事内容
     */

    @TableField(value = "banshijilu_content")
    private String banshijiluContent;


    /**
     * 办事结果
     */

    @TableField(value = "banshijieguo_types")
    private Integer banshijieguoTypes;


    /**
     * 居委会回复
     */

    @TableField(value = "juweihui_content")
    private String juweihuiContent;


    /**
     * 记录时间
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
	 * 设置：办事记录编号
	 */
    public String getBanshijiluUuidNumber() {
        return banshijiluUuidNumber;
    }


    /**
	 * 获取：办事记录编号
	 */

    public void setBanshijiluUuidNumber(String banshijiluUuidNumber) {
        this.banshijiluUuidNumber = banshijiluUuidNumber;
    }
    /**
	 * 设置：办事标题
	 */
    public String getBanshijiluName() {
        return banshijiluName;
    }


    /**
	 * 获取：办事标题
	 */

    public void setBanshijiluName(String banshijiluName) {
        this.banshijiluName = banshijiluName;
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
	 * 设置：办事时间
	 */
    public Date getBanshiTime() {
        return banshiTime;
    }


    /**
	 * 获取：办事时间
	 */

    public void setBanshiTime(Date banshiTime) {
        this.banshiTime = banshiTime;
    }
    /**
	 * 设置：办事内容
	 */
    public String getBanshijiluContent() {
        return banshijiluContent;
    }


    /**
	 * 获取：办事内容
	 */

    public void setBanshijiluContent(String banshijiluContent) {
        this.banshijiluContent = banshijiluContent;
    }
    /**
	 * 设置：办事结果
	 */
    public Integer getBanshijieguoTypes() {
        return banshijieguoTypes;
    }


    /**
	 * 获取：办事结果
	 */

    public void setBanshijieguoTypes(Integer banshijieguoTypes) {
        this.banshijieguoTypes = banshijieguoTypes;
    }
    /**
	 * 设置：居委会回复
	 */
    public String getJuweihuiContent() {
        return juweihuiContent;
    }


    /**
	 * 获取：居委会回复
	 */

    public void setJuweihuiContent(String juweihuiContent) {
        this.juweihuiContent = juweihuiContent;
    }
    /**
	 * 设置：记录时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：记录时间
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
