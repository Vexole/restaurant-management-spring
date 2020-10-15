package com.spring.assignment.restaurantmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
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
	private ResponseEntity<String> createUser(@RequestBody User user) {
		userRepository.save(user);
		return ResponseEntity.status(HttpStatus.OK).body("Created");
	}
	
	@RequestMapping("/getAllUsers")
	private ResponseEntity<Iterable<User>> getAllUsers() {
		return ResponseEntity.ok(userRepository.findAll());
	}
}
