package com.spring.assignment.restaurantmanagement.repository;

import org.springframework.data.repository.CrudRepository;

import com.spring.assignment.restaurantmanagement.entity.Item;

public interface ItemRepository extends CrudRepository<Item, Integer> {

}
