package com.spring.assignment.restaurantmanagement.repository;

import org.springframework.data.repository.CrudRepository;

import com.spring.assignment.restaurantmanagement.entity.User;


public interface UserRepository extends CrudRepository<User, Integer> {

}
