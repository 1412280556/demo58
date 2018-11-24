package com.yc.bean;

import java.sql.Timestamp;

public class Columns implements java.io.Serializable{
	private static final long serialVersionUID = 1L;
	private Long id;
	private Long parentid;
	private Long sort;
	private String columnname;
	private String aliasname;
	private String keywords;
	private String description;
	private String createby;
	private String status;
	private Timestamp createdate;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getParentid() {
		return parentid;
	}
	public void setParentid(Long parentid) {
		this.parentid = parentid;
	}
	public Long getSort() {
		return sort;
	}
	public void setSort(Long sort) {
		this.sort = sort;
	}
	public String getColumnname() {
		return columnname;
	}
	public void setColumnname(String columnname) {
		this.columnname = columnname;
	}
	public String getAliasname() {
		return aliasname;
	}
	public void setAliasname(String aliasname) {
		this.aliasname = aliasname;
	}
	public String getKeywords() {
		return keywords;
	}
	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCreateby() {
		return createby;
	}
	public void setCreateby(String createby) {
		this.createby = createby;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Timestamp getCreatedate() {
		return createdate;
	}
	public void setCreatedate(Timestamp createdate) {
		this.createdate = createdate;
	}
	@Override
	public String toString() {
		return "Columns [id=" + id + ", parentid=" + parentid + ", sort=" + sort + ", columnname=" + columnname
				+ ", aliasname=" + aliasname + ", keywords=" + keywords + ", description=" + description + ", createby="
				+ createby + ", status=" + status + ", createdate=" + createdate + "]";
	}

}
