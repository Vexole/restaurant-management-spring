package com.spring.assignment.restaurantmanagement.service;

import java.util.List;

import com.spring.assignment.restaurantmanagement.entity.OrderLog;

public interface OrderService {
	public List<OrderLog> getAllOrders();
	
	public OrderLog getOrderById(Integer id);
	
	public void createOrder(OrderLog order);
}
