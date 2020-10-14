package com.spring.assignment.restaurantmanagement.repository;

import org.springframework.data.repository.CrudRepository;

import com.spring.assignment.restaurantmanagement.entity.PaymentLog;

public interface PaymentRepository extends CrudRepository<PaymentLog, Integer> {

}
