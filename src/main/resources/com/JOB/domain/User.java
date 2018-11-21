package com.JOB.domain;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable{
	private String id;
	private String userName;
	private String userPwd;
	private String email;
	private Date birthday;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public User(String id, String userName, String userPwd, String email, Date birthday) {
		super();
		this.id = id;
		this.userName = userName;
		this.userPwd = userPwd;
		this.email = email;
		this.birthday = birthday;
	}
	public User() {
		super();
	}
	

}
