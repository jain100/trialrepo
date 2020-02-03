package com.example.demo.model;

import java.util.List;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "userpackage")
public class userAppPackage {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY) int id;
	private int userid;
	@Column(name="app_id")
	private int appid;

    public userAppPackage() {
    }
    public userAppPackage(int userid){
        this.userid=userid;
    }
    public userAppPackage(int userid,int appid){
        this.userid=userid;
        this.appid=appid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public int getAppid() {
        return appid;
    }

    public void setAppid(int appid) {
        this.appid = appid;
    }
}
