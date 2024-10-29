package com.entity.vo;

import com.entity.DangyuanfazhanjiluEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 党员发展
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("dangyuanfazhanjilu")
public class DangyuanfazhanjiluVO implements Serializable {
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
     * 党员发展编号
     */

    @TableField(value = "dangyuanfazhanjilu_uuid_number")
    private String dangyuanfazhanjiluUuidNumber;


    /**
     * 发展标题
     */

    @TableField(value = "dangyuanfazhanjilu_name")
    private String dangyuanfazhanjiluName;


    /**
     * 入党文件
     */

    @TableField(value = "dangyuanfazhanjilu_file")
    private String dangyuanfazhanjiluFile;


    /**
     * 入党宣誓视频
     */

    @TableField(value = "dangyuanfazhanjilu_video")
    private String dangyuanfazhanjiluVideo;


    /**
     * 发展类型
     */

    @TableField(value = "dangyuanfazhanjilu_types")
    private Integer dangyuanfazhanjiluTypes;


    /**
     * 发展时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "fazhan_time")
    private Date fazhanTime;


    /**
     * 发展备注
     */

    @TableField(value = "dangyuanfazhanjilu_content")
    private String dangyuanfazhanjiluContent;


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
	 * 设置：党员发展编号
	 */
    public String getDangyuanfazhanjiluUuidNumber() {
        return dangyuanfazhanjiluUuidNumber;
    }


    /**
	 * 获取：党员发展编号
	 */

    public void setDangyuanfazhanjiluUuidNumber(String dangyuanfazhanjiluUuidNumber) {
        this.dangyuanfazhanjiluUuidNumber = dangyuanfazhanjiluUuidNumber;
    }
    /**
	 * 设置：发展标题
	 */
    public String getDangyuanfazhanjiluName() {
        return dangyuanfazhanjiluName;
    }


    /**
	 * 获取：发展标题
	 */

    public void setDangyuanfazhanjiluName(String dangyuanfazhanjiluName) {
        this.dangyuanfazhanjiluName = dangyuanfazhanjiluName;
    }
    /**
	 * 设置：入党文件
	 */
    public String getDangyuanfazhanjiluFile() {
        return dangyuanfazhanjiluFile;
    }


    /**
	 * 获取：入党文件
	 */

    public void setDangyuanfazhanjiluFile(String dangyuanfazhanjiluFile) {
        this.dangyuanfazhanjiluFile = dangyuanfazhanjiluFile;
    }
    /**
	 * 设置：入党宣誓视频
	 */
    public String getDangyuanfazhanjiluVideo() {
        return dangyuanfazhanjiluVideo;
    }


    /**
	 * 获取：入党宣誓视频
	 */

    public void setDangyuanfazhanjiluVideo(String dangyuanfazhanjiluVideo) {
        this.dangyuanfazhanjiluVideo = dangyuanfazhanjiluVideo;
    }
    /**
	 * 设置：发展类型
	 */
    public Integer getDangyuanfazhanjiluTypes() {
        return dangyuanfazhanjiluTypes;
    }


    /**
	 * 获取：发展类型
	 */

    public void setDangyuanfazhanjiluTypes(Integer dangyuanfazhanjiluTypes) {
        this.dangyuanfazhanjiluTypes = dangyuanfazhanjiluTypes;
    }
    /**
	 * 设置：发展时间
	 */
    public Date getFazhanTime() {
        return fazhanTime;
    }


    /**
	 * 获取：发展时间
	 */

    public void setFazhanTime(Date fazhanTime) {
        this.fazhanTime = fazhanTime;
    }
    /**
	 * 设置：发展备注
	 */
    public String getDangyuanfazhanjiluContent() {
        return dangyuanfazhanjiluContent;
    }


    /**
	 * 获取：发展备注
	 */

    public void setDangyuanfazhanjiluContent(String dangyuanfazhanjiluContent) {
        this.dangyuanfazhanjiluContent = dangyuanfazhanjiluContent;
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
