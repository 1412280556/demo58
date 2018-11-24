package com.yc.bean;

import java.sql.Timestamp;

public class Comment implements java.io.Serializable{
	private static final long serialVersionUID = 1L;
	private Long id;
	private Long userid;
	private Long titleid;
	private String content;
	private Timestamp commenttime;
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
	public Long getTitleid() {
		return titleid;
	}
	public void setTitleid(Long titleid) {
		this.titleid = titleid;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Timestamp getCommenttime() {
		return commenttime;
	}
	public void setCommenttime(Timestamp commenttime) {
		this.commenttime = commenttime;
	}
	@Override
	public String toString() {
		return "Comment [id=" + id + ", userid=" + userid + ", titleid=" + titleid + ", content=" + content
				+ ", commenttime=" + commenttime + "]";
	}

}
