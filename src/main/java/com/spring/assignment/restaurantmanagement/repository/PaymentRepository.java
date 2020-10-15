package com.spring.assignment.restaurantmanagement.repository;

import org.springframework.data.repository.CrudRepository;

import com.spring.assignment.restaurantmanagement.entity.Payment;

public interface PaymentRepository extends CrudRepository<Payment, Integer> {
}
