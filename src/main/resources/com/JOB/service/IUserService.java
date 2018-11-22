package com.JOB.service;

import com.JOB.domain.User;
import com.JOB.exception.UserExistException;

public interface IUserService {
	//提供注册服务
	void registerUser(User user)throws UserExistException;
	//提供登陆服务
	User loginUser(String userName,String userPwd);
}
