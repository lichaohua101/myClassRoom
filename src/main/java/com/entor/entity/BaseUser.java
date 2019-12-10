package com.entor.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author LiChaoHua
 * @since 2019-11-11
 */
@TableName("base_user")
public class BaseUser extends Model<BaseUser> {

    private static final long serialVersionUID = 1L;

	@TableId(value="id", type= IdType.AUTO)
	private Integer id;
	private String areaid;
	private Date createtime;
	private String cssStyle;
	private String email;
	private String mobile;
	private Date modifyTime;
	private String orgId;
	private String password;
	private String realname;
	private Integer state;
	private String username;
	private Integer flag;
	private Integer userType;
	private String wxApiCode;


	public Integer getId() {
		return id;
	}

	public BaseUser setId(Integer id) {
		this.id = id;
		return this;
	}

	public String getAreaid() {
		return areaid;
	}

	public BaseUser setAreaid(String areaid) {
		this.areaid = areaid;
		return this;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public BaseUser setCreatetime(Date createtime) {
		this.createtime = createtime;
		return this;
	}

	public String getCssStyle() {
		return cssStyle;
	}

	public BaseUser setCssStyle(String cssStyle) {
		this.cssStyle = cssStyle;
		return this;
	}

	public String getEmail() {
		return email;
	}

	public BaseUser setEmail(String email) {
		this.email = email;
		return this;
	}

	public String getMobile() {
		return mobile;
	}

	public BaseUser setMobile(String mobile) {
		this.mobile = mobile;
		return this;
	}

	public Date getModifyTime() {
		return modifyTime;
	}

	public BaseUser setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
		return this;
	}

	public String getOrgId() {
		return orgId;
	}

	public BaseUser setOrgId(String orgId) {
		this.orgId = orgId;
		return this;
	}

	public String getPassword() {
		return password;
	}

	public BaseUser setPassword(String password) {
		this.password = password;
		return this;
	}

	public String getRealname() {
		return realname;
	}

	public BaseUser setRealname(String realname) {
		this.realname = realname;
		return this;
	}

	public Integer getState() {
		return state;
	}

	public BaseUser setState(Integer state) {
		this.state = state;
		return this;
	}

	public String getUsername() {
		return username;
	}

	public BaseUser setUsername(String username) {
		this.username = username;
		return this;
	}

	public Integer getFlag() {
		return flag;
	}

	public BaseUser setFlag(Integer flag) {
		this.flag = flag;
		return this;
	}

	public Integer getUserType() {
		return userType;
	}

	public BaseUser setUserType(Integer userType) {
		this.userType = userType;
		return this;
	}

	public String getWxApiCode() {
		return wxApiCode;
	}

	public BaseUser setWxApiCode(String wxApiCode) {
		this.wxApiCode = wxApiCode;
		return this;
	}

	public static final String ID = "id";

	public static final String AREAID = "areaid";

	public static final String CREATETIME = "createtime";

	public static final String CSSSTYLE = "cssStyle";

	public static final String EMAIL = "email";

	public static final String MOBILE = "mobile";

	public static final String MODIFYTIME = "modifyTime";

	public static final String ORGID = "orgId";

	public static final String PASSWORD = "password";

	public static final String REALNAME = "realname";

	public static final String STATE = "state";

	public static final String USERNAME = "username";

	public static final String FLAG = "flag";

	public static final String USERTYPE = "userType";

	public static final String WXAPICODE = "wxApiCode";

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

	@Override
	public String toString() {
		return "BaseUser{" +
			", id=" + id +
			", areaid=" + areaid +
			", createtime=" + createtime +
			", cssStyle=" + cssStyle +
			", email=" + email +
			", mobile=" + mobile +
			", modifyTime=" + modifyTime +
			", orgId=" + orgId +
			", password=" + password +
			", realname=" + realname +
			", state=" + state +
			", username=" + username +
			", flag=" + flag +
			", userType=" + userType +
			", wxApiCode=" + wxApiCode +
			"}";
	}
}
