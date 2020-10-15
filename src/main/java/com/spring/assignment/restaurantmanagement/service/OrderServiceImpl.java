package com.spring.assignment.restaurantmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.assignment.restaurantmanagement.entity.OrderLog;
import com.spring.assignment.restaurantmanagement.repository.OrderLogRepository;
import com.spring.assignment.restaurantmanagement.utils.UserUtils;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderLogRepository orderLog;

	@Override
	public List<OrderLog> getAllOrders() {
		return (List<OrderLog>) orderLog.findByUserName(UserUtils.getUserName());
	}

	@Override
	public OrderLog getOrderById(Integer id) {
		return orderLog.findById(id).get();
	}

	@Override
	public void createOrder(OrderLog order) {
		orderLog.save(order);
	}

}
