package com.sap.platform.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.sap.platform.model.User;

@Repository
public class UserDao {
	
	public static List<User> users;
	
	static {
		users = new ArrayList<>();
		
		users.add( new User( 0, "user1", "abc" ) );
		users.add( new User( 1, "user2", "def" ) );
		users.add( new User( 2, "user3", "ghi" ) );
		users.add( new User( 3, "user4", "jkl" ) );
	}
	
	public List<User> getAllUsers() {
		
		return users;
	}
	
	public boolean verify(User user) {
		
		String userName = "user1";
		String password = "abc";
		
		if( user.getUserName().equals(userName) && user.getPassword().equals(password) )
			return true;
		else
			return false;
	}

}
