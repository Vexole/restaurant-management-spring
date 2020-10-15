package com.spring.assignment.restaurantmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.assignment.restaurantmanagement.entity.Item;
import com.spring.assignment.restaurantmanagement.service.ItemService;

@RestController
@RequestMapping("/item")
public class ItemController {
	
	@Autowired
	ItemService itemService;
	
	@RequestMapping("/createItem")
	private ResponseEntity<String> createUser(@RequestBody Item item) {
		itemService.createItem(item);
		return ResponseEntity.status(HttpStatus.OK).body("Created");
	}
	
	@RequestMapping("/getAllItems")
	private ResponseEntity<Iterable<Item>> getAllItems() {
		return ResponseEntity.ok(itemService.getAllItems());
	}
}
