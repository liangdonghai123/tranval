package com.JOB.dao.Impl;

import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.JOB.dao.IUserDao;
import com.JOB.domain.User;

public class UserDaoImpl implements IUserDao{

	public User find(String userName, String userPwd) {
		return null;
	}

	public void add(User user) {
		
	}

	public User find(String userName) {
		String resourse = "conf.xml";
		InputStream is = UserDaoImpl.class.getResourceAsStream(resorse);
		SqlSessionFactory sessionFactory =  new SqlSessionFactoryBuilder().build(is);
		SqlSession session = sessionFactory.openSession();
		String stamtement = "com.JOB.mapping.userMapper.xml";
		User user = session.select(statement, userName);
		return user;
	}
}
