package com.sap.platform.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.sap.platform.model.User;

@Repository
public interface IUserDao {

	public List<User> getAllUsers();
	public boolean verify(User user);
	
}
