package com.entor.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.enums.IdType;
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
@TableName("base_role")
public class BaseRole extends Model<BaseRole> {

    private static final long serialVersionUID = 1L;

	@TableId(value="rid", type= IdType.AUTO)
	private Integer rid;
	private String info;
	private String rname;
	private Integer flag;
	private String orgId;


	public Integer getRid() {
		return rid;
	}

	public BaseRole setRid(Integer rid) {
		this.rid = rid;
		return this;
	}

	public String getInfo() {
		return info;
	}

	public BaseRole setInfo(String info) {
		this.info = info;
		return this;
	}

	public String getRname() {
		return rname;
	}

	public BaseRole setRname(String rname) {
		this.rname = rname;
		return this;
	}

	public Integer getFlag() {
		return flag;
	}

	public BaseRole setFlag(Integer flag) {
		this.flag = flag;
		return this;
	}

	public String getOrgId() {
		return orgId;
	}

	public BaseRole setOrgId(String orgId) {
		this.orgId = orgId;
		return this;
	}

	public static final String RID = "rid";

	public static final String INFO = "info";

	public static final String RNAME = "rname";

	public static final String FLAG = "flag";

	public static final String ORGID = "orgId";

	@Override
	protected Serializable pkVal() {
		return this.rid;
	}

	@Override
	public String toString() {
		return "BaseRole{" +
			", rid=" + rid +
			", info=" + info +
			", rname=" + rname +
			", flag=" + flag +
			", orgId=" + orgId +
			"}";
	}
}
