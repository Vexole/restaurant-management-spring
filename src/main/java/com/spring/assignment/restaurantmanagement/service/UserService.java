package com.spring.assignment.restaurantmanagement.service;

import java.util.List;

import com.spring.assignment.restaurantmanagement.entity.User;

public interface UserService {
	public void createUser(User user) ;
	public List<User> getAllUsers();
}
