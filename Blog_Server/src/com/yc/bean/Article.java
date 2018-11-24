package com.yc.bean;

import java.sql.Timestamp;

public class Article implements java.io.Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private Long columnid;
	private String title;
	private String content;
	private String keywords;
	private String description;
	private String label;
	private String titleimgs;
	private String status;
	private String type;
	private String author;
	private Timestamp releasetime;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}


	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
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
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Long getColumnid() {
		return columnid;
	}
	public void setColumnid(Long columnid) {
		this.columnid = columnid;
	}
	public String getKeywords() {
		return keywords;
	}
	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}
	public String getTitleimgs() {
		return titleimgs;
	}
	public void setTitleimgs(String titleimgs) {
		this.titleimgs = titleimgs;
	}
	public Timestamp getReleasetime() {
		return releasetime;
	}
	public void setReleasetime(Timestamp releasetime) {
		this.releasetime = releasetime;
	}
	@Override
	public String toString() {
		return "Article [id=" + id + ", columnid=" + columnid + ", title=" + title + ", content=" + content
				+ ", keywords=" + keywords + ", description=" + description + ", label=" + label + ", titleimgs="
				+ titleimgs + ", status=" + status + ", type=" + type + ", author=" + author + ", releasetime="
				+ releasetime + "]";
	}
}
