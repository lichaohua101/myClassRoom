package com.entor.entity;

import java.io.Serializable;

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
@TableName("base_user_role")
public class BaseUserRole extends Model<BaseUserRole> {

    private static final long serialVersionUID = 1L;

	private Integer userid;
	private Integer rid;


	public Integer getUserid() {
		return userid;
	}

	public BaseUserRole setUserid(Integer userid) {
		this.userid = userid;
		return this;
	}

	public Integer getRid() {
		return rid;
	}

	public BaseUserRole setRid(Integer rid) {
		this.rid = rid;
		return this;
	}

	public static final String USERID = "userid";

	public static final String RID = "rid";

	@Override
	protected Serializable pkVal() {
		return this.userid;
	}

	@Override
	public String toString() {
		return "BaseUserRole{" +
			", userid=" + userid +
			", rid=" + rid +
			"}";
	}
}
