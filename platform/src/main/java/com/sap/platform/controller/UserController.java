package com.sap.platform.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sap.platform.model.User;
import com.sap.platform.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/all", method=RequestMethod.POST)
	@ResponseBody
	public List<User> getAllUsers() {
		return userService.getAllUsers();
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public boolean login( @RequestBody User user ) {
		return userService.verify(user);
	}
	
}
