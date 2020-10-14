package com.spring.assignment.restaurantmanagement.repository;

import org.springframework.data.repository.CrudRepository;

import com.spring.assignment.restaurantmanagement.entity.ItemOrder;

public interface ItemOrderRepository extends CrudRepository<ItemOrder, Integer> {

}
