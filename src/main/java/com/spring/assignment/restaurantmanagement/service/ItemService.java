package com.spring.assignment.restaurantmanagement.service;

import java.util.List;

import com.spring.assignment.restaurantmanagement.entity.Item;

public interface ItemService {

	public List<Item> getAllItems();
	
	public void createItem(Item item);
}
