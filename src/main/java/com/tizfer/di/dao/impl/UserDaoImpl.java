package com.tizfer.di.dao.impl;

import org.springframework.stereotype.Repository;

import com.tizfer.di.dao.UserDao;

@Repository
public class UserDaoImpl implements UserDao{

	public void addUser() {
		System.out.println("Resource----DAO-------addUser()");
	}

}
