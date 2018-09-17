package com.sap.platform.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sap.platform.dao.IUserDao;
import com.sap.platform.model.User;

@Service
public class UserService {
	
	@Autowired
	private IUserDao userDao;
	
	public List<User> getAllUsers() {
		return userDao.getAllUsers();
	}

	public boolean verify(User user) {
		return userDao.verify(user);
	}

}
