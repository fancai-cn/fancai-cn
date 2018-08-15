package com.tizfer.di.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.tizfer.di.dao.UserDao;
import com.tizfer.di.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService{

	@Resource
	UserDao userDao;
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public void addUser() {
		userDao.addUser();
	}
}
