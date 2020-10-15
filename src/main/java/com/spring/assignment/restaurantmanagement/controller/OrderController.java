package com.spring.assignment.restaurantmanagement.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.assignment.restaurantmanagement.entity.ItemOrder;
import com.spring.assignment.restaurantmanagement.entity.OrderCreationDto;
import com.spring.assignment.restaurantmanagement.entity.OrderDto;
import com.spring.assignment.restaurantmanagement.entity.OrderLog;
import com.spring.assignment.restaurantmanagement.repository.ItemRepository;
import com.spring.assignment.restaurantmanagement.repository.UserRepository;
import com.spring.assignment.restaurantmanagement.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {
	@Autowired
	OrderService orderService;

	@Autowired
	UserRepository userRepo;

	@Autowired
	ItemRepository itemRepo;

	@RequestMapping("/createOrder")
	public ResponseEntity<?> createOrder(@RequestBody OrderCreationDto orderCreationDto) {
		OrderLog orderLog = (new OrderLog(userRepo.findById(orderCreationDto.getUser().getId()).get(), new java.sql.Date(new Date().getTime())));

		List<ItemOrder> orderList = new ArrayList<>();
		for (OrderDto order : orderCreationDto.getItems()) {
			ItemOrder o = new ItemOrder(order.getQuantity(), order.getTotalPrice(), "");
			o.setItem(order.getItem());
			orderList.add(o);
		}
		
		orderLog.setItemOrder(orderList);		
		orderService.createOrder(orderLog);
		return ResponseEntity.ok(orderLog);
	}

	@RequestMapping("getOrders")
	public ResponseEntity<?> getOrders() {
		return ResponseEntity.ok().body(orderService.getAllOrders());
	}
	
	@RequestMapping("getOrderById")
	public ResponseEntity<?> getOrderById(@RequestParam("id") Integer id) {
		return ResponseEntity.ok(orderService.getOrderById(id));
	}

}
