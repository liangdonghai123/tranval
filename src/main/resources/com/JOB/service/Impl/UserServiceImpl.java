package com.JOB.service.Impl;

import com.JOB.dao.IUserDao;
import com.JOB.dao.Impl.UserDaoImpl;
import com.JOB.domain.User;
import com.JOB.exception.UserExistException;
import com.JOB.service.IUserService;

public class UserServiceImpl implements IUserService{
	private IUserDao userDao = new UserDaoImpl();
	public User loginUser(String userName, String userPwd) {
		return userDao.find(userName, userPwd);
	}
public void registerUser(User user) throws UserExistException{
	if(userDao.find(user.getUserName())!=null) {
		throw new UserExistException("注册的用户名已存在!!!");
		}
	userDao.add(user);
	} 
}
