package com.JOB.dao;

import org.apache.ibatis.annotations.Insert;

import com.JOB.domain.User;

public interface IUserDao {
	User find(String userName,String userPwd);
	@Insert ("insert into users (UserName,Userpassword) values(#{UserName},#Userpassword)")
	void add (User user);
	User find(String userName);
}
