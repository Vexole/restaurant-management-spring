package com.spring.assignment.restaurantmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.assignment.restaurantmanagement.entity.User;
import com.spring.assignment.restaurantmanagement.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping("/createUser")
	private ResponseEntity<String> createUser(@RequestBody User user) {
		userService.createUser(user);
		return ResponseEntity.status(HttpStatus.OK).body("Created");
	}
	
	@RequestMapping("/getAllUsers")
	private ResponseEntity<Iterable<User>> getAllUsers() {
		return ResponseEntity.ok(userService.getAllUsers());
	}
}
