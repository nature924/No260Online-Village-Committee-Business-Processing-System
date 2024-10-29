package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.DangyuanfazhanjiluEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 党员发展
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("dangyuanfazhanjilu")
public class DangyuanfazhanjiluView extends DangyuanfazhanjiluEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表
	/**
	* 发展类型的值
	*/
	@ColumnInfo(comment="发展类型的字典表值",type="varchar(200)")
	private String dangyuanfazhanjiluValue;

	//级联表 用户
		/**
		* 用户姓名
		*/

		@ColumnInfo(comment="用户姓名",type="varchar(200)")
		private String yonghuName;
		/**
		* 用户手机号
		*/

		@ColumnInfo(comment="用户手机号",type="varchar(200)")
		private String yonghuPhone;
		/**
		* 用户身份证号
		*/

		@ColumnInfo(comment="用户身份证号",type="varchar(200)")
		private String yonghuIdNumber;
		/**
		* 用户头像
		*/

		@ColumnInfo(comment="用户头像",type="varchar(200)")
		private String yonghuPhoto;
		/**
		* 文化程度
		*/
		@ColumnInfo(comment="文化程度",type="int(11)")
		private Integer wenhuaTypes;
			/**
			* 文化程度的值
			*/
			@ColumnInfo(comment="文化程度的字典表值",type="varchar(200)")
			private String wenhuaValue;
		/**
		* 政治面貌
		*/
		@ColumnInfo(comment="政治面貌",type="int(11)")
		private Integer zhuangtaiTypes;
			/**
			* 政治面貌的值
			*/
			@ColumnInfo(comment="政治面貌的字典表值",type="varchar(200)")
			private String zhuangtaiValue;
		/**
		* 用户邮箱
		*/

		@ColumnInfo(comment="用户邮箱",type="varchar(200)")
		private String yonghuEmail;



	public DangyuanfazhanjiluView() {

	}

	public DangyuanfazhanjiluView(DangyuanfazhanjiluEntity dangyuanfazhanjiluEntity) {
		try {
			BeanUtils.copyProperties(this, dangyuanfazhanjiluEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	//当前表的
	/**
	* 获取： 发展类型的值
	*/
	public String getDangyuanfazhanjiluValue() {
		return dangyuanfazhanjiluValue;
	}
	/**
	* 设置： 发展类型的值
	*/
	public void setDangyuanfazhanjiluValue(String dangyuanfazhanjiluValue) {
		this.dangyuanfazhanjiluValue = dangyuanfazhanjiluValue;
	}


	//级联表的get和set 用户

		/**
		* 获取： 用户姓名
		*/
		public String getYonghuName() {
			return yonghuName;
		}
		/**
		* 设置： 用户姓名
		*/
		public void setYonghuName(String yonghuName) {
			this.yonghuName = yonghuName;
		}

		/**
		* 获取： 用户手机号
		*/
		public String getYonghuPhone() {
			return yonghuPhone;
		}
		/**
		* 设置： 用户手机号
		*/
		public void setYonghuPhone(String yonghuPhone) {
			this.yonghuPhone = yonghuPhone;
		}

		/**
		* 获取： 用户身份证号
		*/
		public String getYonghuIdNumber() {
			return yonghuIdNumber;
		}
		/**
		* 设置： 用户身份证号
		*/
		public void setYonghuIdNumber(String yonghuIdNumber) {
			this.yonghuIdNumber = yonghuIdNumber;
		}

		/**
		* 获取： 用户头像
		*/
		public String getYonghuPhoto() {
			return yonghuPhoto;
		}
		/**
		* 设置： 用户头像
		*/
		public void setYonghuPhoto(String yonghuPhoto) {
			this.yonghuPhoto = yonghuPhoto;
		}
		/**
		* 获取： 文化程度
		*/
		public Integer getWenhuaTypes() {
			return wenhuaTypes;
		}
		/**
		* 设置： 文化程度
		*/
		public void setWenhuaTypes(Integer wenhuaTypes) {
			this.wenhuaTypes = wenhuaTypes;
		}


			/**
			* 获取： 文化程度的值
			*/
			public String getWenhuaValue() {
				return wenhuaValue;
			}
			/**
			* 设置： 文化程度的值
			*/
			public void setWenhuaValue(String wenhuaValue) {
				this.wenhuaValue = wenhuaValue;
			}
		/**
		* 获取： 政治面貌
		*/
		public Integer getZhuangtaiTypes() {
			return zhuangtaiTypes;
		}
		/**
		* 设置： 政治面貌
		*/
		public void setZhuangtaiTypes(Integer zhuangtaiTypes) {
			this.zhuangtaiTypes = zhuangtaiTypes;
		}


			/**
			* 获取： 政治面貌的值
			*/
			public String getZhuangtaiValue() {
				return zhuangtaiValue;
			}
			/**
			* 设置： 政治面貌的值
			*/
			public void setZhuangtaiValue(String zhuangtaiValue) {
				this.zhuangtaiValue = zhuangtaiValue;
			}

		/**
		* 获取： 用户邮箱
		*/
		public String getYonghuEmail() {
			return yonghuEmail;
		}
		/**
		* 设置： 用户邮箱
		*/
		public void setYonghuEmail(String yonghuEmail) {
			this.yonghuEmail = yonghuEmail;
		}


	@Override
	public String toString() {
		return "DangyuanfazhanjiluView{" +
			", dangyuanfazhanjiluValue=" + dangyuanfazhanjiluValue +
			", yonghuName=" + yonghuName +
			", yonghuPhone=" + yonghuPhone +
			", yonghuIdNumber=" + yonghuIdNumber +
			", yonghuPhoto=" + yonghuPhoto +
			", yonghuEmail=" + yonghuEmail +
			"} " + super.toString();
	}
}
