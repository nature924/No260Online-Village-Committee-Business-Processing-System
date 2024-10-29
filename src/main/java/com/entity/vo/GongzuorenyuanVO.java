package com.entity.vo;

import com.entity.GongzuorenyuanEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 工作人员
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("gongzuorenyuan")
public class GongzuorenyuanVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 账户
     */

    @TableField(value = "username")
    private String username;


    /**
     * 密码
     */

    @TableField(value = "password")
    private String password;


    /**
     * 工作人员姓名
     */

    @TableField(value = "gongzuorenyuan_name")
    private String gongzuorenyuanName;


    /**
     * 工作人员手机号
     */

    @TableField(value = "gongzuorenyuan_phone")
    private String gongzuorenyuanPhone;


    /**
     * 工作人员身份证号
     */

    @TableField(value = "gongzuorenyuan_id_number")
    private String gongzuorenyuanIdNumber;


    /**
     * 工作人员头像
     */

    @TableField(value = "gongzuorenyuan_photo")
    private String gongzuorenyuanPhoto;


    /**
     * 性别
     */

    @TableField(value = "sex_types")
    private Integer sexTypes;


    /**
     * 工作人员邮箱
     */

    @TableField(value = "gongzuorenyuan_email")
    private String gongzuorenyuanEmail;


    /**
     * 创建时间
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
	 * 设置：账户
	 */
    public String getUsername() {
        return username;
    }


    /**
	 * 获取：账户
	 */

    public void setUsername(String username) {
        this.username = username;
    }
    /**
	 * 设置：密码
	 */
    public String getPassword() {
        return password;
    }


    /**
	 * 获取：密码
	 */

    public void setPassword(String password) {
        this.password = password;
    }
    /**
	 * 设置：工作人员姓名
	 */
    public String getGongzuorenyuanName() {
        return gongzuorenyuanName;
    }


    /**
	 * 获取：工作人员姓名
	 */

    public void setGongzuorenyuanName(String gongzuorenyuanName) {
        this.gongzuorenyuanName = gongzuorenyuanName;
    }
    /**
	 * 设置：工作人员手机号
	 */
    public String getGongzuorenyuanPhone() {
        return gongzuorenyuanPhone;
    }


    /**
	 * 获取：工作人员手机号
	 */

    public void setGongzuorenyuanPhone(String gongzuorenyuanPhone) {
        this.gongzuorenyuanPhone = gongzuorenyuanPhone;
    }
    /**
	 * 设置：工作人员身份证号
	 */
    public String getGongzuorenyuanIdNumber() {
        return gongzuorenyuanIdNumber;
    }


    /**
	 * 获取：工作人员身份证号
	 */

    public void setGongzuorenyuanIdNumber(String gongzuorenyuanIdNumber) {
        this.gongzuorenyuanIdNumber = gongzuorenyuanIdNumber;
    }
    /**
	 * 设置：工作人员头像
	 */
    public String getGongzuorenyuanPhoto() {
        return gongzuorenyuanPhoto;
    }


    /**
	 * 获取：工作人员头像
	 */

    public void setGongzuorenyuanPhoto(String gongzuorenyuanPhoto) {
        this.gongzuorenyuanPhoto = gongzuorenyuanPhoto;
    }
    /**
	 * 设置：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }


    /**
	 * 获取：性别
	 */

    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 设置：工作人员邮箱
	 */
    public String getGongzuorenyuanEmail() {
        return gongzuorenyuanEmail;
    }


    /**
	 * 获取：工作人员邮箱
	 */

    public void setGongzuorenyuanEmail(String gongzuorenyuanEmail) {
        this.gongzuorenyuanEmail = gongzuorenyuanEmail;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
