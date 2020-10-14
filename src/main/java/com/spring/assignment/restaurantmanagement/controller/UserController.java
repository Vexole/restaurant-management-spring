package com.spring.assignment.restaurantmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.assignment.restaurantmanagement.entity.User;
import com.spring.assignment.restaurantmanagement.repository.UserRepository;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserRepository userRepository;
	
	@RequestMapping("/createUser")
	private String createUser(User user) {
		userRepository.save(user);
		return "Hello";
	}
}
