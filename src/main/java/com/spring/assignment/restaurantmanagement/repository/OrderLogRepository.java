package com.spring.assignment.restaurantmanagement.repository;

import org.springframework.data.repository.CrudRepository;

import com.spring.assignment.restaurantmanagement.entity.OrderLog;

public interface OrderLogRepository extends CrudRepository<OrderLog, Integer> {

}
