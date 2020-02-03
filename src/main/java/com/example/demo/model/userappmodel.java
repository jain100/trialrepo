package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class userappmodel {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY) long id;
	private String userId;
	private String appnames;
	public userappmodel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public userappmodel(String userId, String appnames) {
		super();
		this.userId = userId;
		this.appnames = appnames;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getAppnames() {
		return appnames;
	}
	public void setAppnames(String appnames) {
		this.appnames = appnames;
	}
	
	
	
	
}
