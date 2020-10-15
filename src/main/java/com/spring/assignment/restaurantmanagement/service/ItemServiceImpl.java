package com.spring.assignment.restaurantmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.assignment.restaurantmanagement.entity.Item;
import com.spring.assignment.restaurantmanagement.repository.ItemRepository;

@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	ItemRepository itemRepository;
	
	@Override
	public List<Item> getAllItems() {
		return (List<Item>) itemRepository.findAll();
	}

	@Override
	public void createItem(Item item) {
		itemRepository.save(item);		
	}

}
