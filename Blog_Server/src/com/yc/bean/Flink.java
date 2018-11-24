package com.yc.bean;

import java.sql.Timestamp;

public class Flink implements java.io.Serializable{
	private static final long serialVersionUID = 1L;
	private Long id;
	private Long sort;
	private Timestamp createdate;
	private String name;
	private String weburl;
	private String linkimg;
	private String description;
	private String status;
	private String openways;
	private String createby;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getSort() {
		return sort;
	}
	public void setSort(Long sort) {
		this.sort = sort;
	}
	public Timestamp getCreatedate() {
		return createdate;
	}
	public void setCreatedate(Timestamp createdate) {
		this.createdate = createdate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWeburl() {
		return weburl;
	}
	public void setWeburl(String weburl) {
		this.weburl = weburl;
	}
	public String getLinkimg() {
		return linkimg;
	}
	public void setLinkimg(String linkimg) {
		this.linkimg = linkimg;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getOpenways() {
		return openways;
	}
	public void setOpenways(String openways) {
		this.openways = openways;
	}
	public String getCreateby() {
		return createby;
	}
	public void setCreateby(String createby) {
		this.createby = createby;
	}
	@Override
	public String toString() {
		return "Flink [id=" + id + ", sort=" + sort + ", createdate=" + createdate + ", name=" + name + ", weburl="
				+ weburl + ", linkimg=" + linkimg + ", description=" + description + ", status=" + status
				+ ", openways=" + openways + ", createby=" + createby + "]";
	}
	
}
