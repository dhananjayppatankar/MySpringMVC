package com.dhan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dhan.dao.UserDao;
import com.dhan.model.User;

@Service
public class UserService {

	@Autowired
	private UserDao userDao;

	public List<User> getUserList() {
		
		return userDao.getAllusers();
	}

	public void createUser(User user) {
		userDao.addUser(user);
		
	}

}
