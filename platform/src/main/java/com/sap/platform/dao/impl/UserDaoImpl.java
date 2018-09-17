package com.sap.platform.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.sap.platform.dao.IUserDao;
import com.sap.platform.model.User;

public class UserDaoImpl implements IUserDao {

	public static List<User> users;

	static {
		users = new ArrayList<>();

		users.add(new User(0, "user1", "abc"));
		users.add(new User(1, "user2", "def"));
		users.add(new User(2, "user3", "ghi"));
		users.add(new User(3, "user4", "jkl"));
	}
	
	@Override
	public List<User> getAllUsers() {
		return users;
	}

	@Override
	public boolean verify(User user) {
		String userName = "user1";
		String password = "abc";
		
		if( user.getUserName().equals(userName) && user.getPassword().equals(password) )
			return true;
		else
			return false;
	}


}
