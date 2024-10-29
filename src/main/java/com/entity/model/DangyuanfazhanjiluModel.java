package com.entity.model;

import com.entity.DangyuanfazhanjiluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 党员发展
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class DangyuanfazhanjiluModel implements Serializable {
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
     * 党员发展编号
     */
    private String dangyuanfazhanjiluUuidNumber;


    /**
     * 发展标题
     */
    private String dangyuanfazhanjiluName;


    /**
     * 入党文件
     */
    private String dangyuanfazhanjiluFile;


    /**
     * 入党宣誓视频
     */
    private String dangyuanfazhanjiluVideo;


    /**
     * 发展类型
     */
    private Integer dangyuanfazhanjiluTypes;


    /**
     * 发展时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date fazhanTime;


    /**
     * 发展备注
     */
    private String dangyuanfazhanjiluContent;


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
