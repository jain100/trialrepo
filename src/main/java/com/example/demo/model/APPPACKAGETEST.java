package com.example.demo.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class APPPACKAGETEST {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)@Column(name = "app_id") int id;
	private String packagename;
	@OneToMany(targetEntity = userAppPackage.class)
	@JoinColumn(name="app_id",referencedColumnName = "app_id")
	private List<userAppPackage> userapppackage;

	public APPPACKAGETEST() {
	}
	public APPPACKAGETEST(String packagename){
		this.packagename=packagename;
	}
	public APPPACKAGETEST(String packagename,List<userAppPackage> userapppackage){
		this.packagename=packagename;
		this.userapppackage=userapppackage;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPackagename() {
		return packagename;
	}

	public void setPackagename(String packagename) {
		this.packagename = packagename;
	}

	public List<userAppPackage> getUserapppackage() {
		return userapppackage;
	}

	public void setUserapppackage(List<userAppPackage> userapppackage) {
		this.userapppackage = userapppackage;
	}
}
