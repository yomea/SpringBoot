package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.dao.UserDao;
import com.example.demo.entity.User;

public class UserService {
	
	@Autowired
	private UserDao userDao;
	
	public void insert(User user) {
		userDao.save(user);
	}
	
	public void update(User user) {
		userDao.update(user.getUsername());
	}

}
