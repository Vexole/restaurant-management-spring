package com.spring.assignment.restaurantmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.assignment.restaurantmanagement.entity.User;
import com.spring.assignment.restaurantmanagement.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;
	
	@Override
	public void createUser(User user) {
		userRepository.save(user);
	}

	@Override
	public List<User> getAllUsers() {
		return (List<User>) userRepository.findAll();
	}

}
