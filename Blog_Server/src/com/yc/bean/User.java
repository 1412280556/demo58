package com.yc.bean;

import java.sql.Timestamp;

public class User implements java.io.Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	private String account;
	private String pwd;
	private String tel;
	private String createby;
	private Timestamp createdate;//日期+时间       java.sql.date 纯日期
	private String status;
	private String type;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCreateby() {
		return createby;
	}
	public void setCreateby(String createby) {
		this.createby = createby;
	}
	public Timestamp getCreatedate() {
		return createdate;
	}
	public void setCreatedate(Timestamp createdate) {
		this.createdate = createdate;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", account=" + account + ", pwd=" + pwd + ", tel=" + tel
				+ ", createby=" + createby + ", createdate=" + createdate + ", status=" + status + ", type=" + type
				+ "]";
	}
	
}
