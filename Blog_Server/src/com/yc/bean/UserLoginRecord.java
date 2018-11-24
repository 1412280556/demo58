package com.yc.bean;

import java.sql.Timestamp;

public class UserLoginRecord implements java.io.Serializable{
	private static final long serialVersionUID = 1L;
	private Long id;
	private Long userid;
	private Timestamp time;
	private String loginip;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getUserid() {
		return userid;
	}
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	public Timestamp getTime() {
		return time;
	}
	public void setTime(Timestamp time) {
		this.time = time;
	}
	public String getLoginip() {
		return loginip;
	}
	public void setLoginip(String loginip) {
		this.loginip = loginip;
	}
	@Override
	public String toString() {
		return "UserLoginRecord [id=" + id + ", userid=" + userid + ", time=" + time + ", loginip=" + loginip + "]";
	}
}
