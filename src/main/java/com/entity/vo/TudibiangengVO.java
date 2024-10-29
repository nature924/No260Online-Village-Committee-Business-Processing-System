package com.entity.vo;

import com.entity.TudibiangengEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 土地变更
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("tudibiangeng")
public class TudibiangengVO implements Serializable {
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
     * 土地变更编号
     */

    @TableField(value = "tudibiangeng_uuid_number")
    private String tudibiangengUuidNumber;


    /**
     * 土地变更标题
     */

    @TableField(value = "tudibiangeng_name")
    private String tudibiangengName;


    /**
     * 土地变更类型
     */

    @TableField(value = "tudibiangeng_types")
    private Integer tudibiangengTypes;


    /**
     * 土地位置
     */

    @TableField(value = "tudibiangeng_address")
    private String tudibiangengAddress;


    /**
     * 变更时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "tudibiangeng_time")
    private Date tudibiangengTime;


    /**
     * 变更内容
     */

    @TableField(value = "tudibiangeng_content")
    private String tudibiangengContent;


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
	 * 设置：土地变更编号
	 */
    public String getTudibiangengUuidNumber() {
        return tudibiangengUuidNumber;
    }


    /**
	 * 获取：土地变更编号
	 */

    public void setTudibiangengUuidNumber(String tudibiangengUuidNumber) {
        this.tudibiangengUuidNumber = tudibiangengUuidNumber;
    }
    /**
	 * 设置：土地变更标题
	 */
    public String getTudibiangengName() {
        return tudibiangengName;
    }


    /**
	 * 获取：土地变更标题
	 */

    public void setTudibiangengName(String tudibiangengName) {
        this.tudibiangengName = tudibiangengName;
    }
    /**
	 * 设置：土地变更类型
	 */
    public Integer getTudibiangengTypes() {
        return tudibiangengTypes;
    }


    /**
	 * 获取：土地变更类型
	 */

    public void setTudibiangengTypes(Integer tudibiangengTypes) {
        this.tudibiangengTypes = tudibiangengTypes;
    }
    /**
	 * 设置：土地位置
	 */
    public String getTudibiangengAddress() {
        return tudibiangengAddress;
    }


    /**
	 * 获取：土地位置
	 */

    public void setTudibiangengAddress(String tudibiangengAddress) {
        this.tudibiangengAddress = tudibiangengAddress;
    }
    /**
	 * 设置：变更时间
	 */
    public Date getTudibiangengTime() {
        return tudibiangengTime;
    }


    /**
	 * 获取：变更时间
	 */

    public void setTudibiangengTime(Date tudibiangengTime) {
        this.tudibiangengTime = tudibiangengTime;
    }
    /**
	 * 设置：变更内容
	 */
    public String getTudibiangengContent() {
        return tudibiangengContent;
    }


    /**
	 * 获取：变更内容
	 */

    public void setTudibiangengContent(String tudibiangengContent) {
        this.tudibiangengContent = tudibiangengContent;
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
