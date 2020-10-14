package com.spring.assignment.restaurantmanagement.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.assignment.restaurantmanagement.entity.Item;
import com.spring.assignment.restaurantmanagement.entity.ItemOrder;
import com.spring.assignment.restaurantmanagement.entity.OrderCreationDto;
import com.spring.assignment.restaurantmanagement.entity.OrderDto;
import com.spring.assignment.restaurantmanagement.entity.OrderLog;
import com.spring.assignment.restaurantmanagement.repository.ItemOrderRepository;
import com.spring.assignment.restaurantmanagement.repository.ItemRepository;
import com.spring.assignment.restaurantmanagement.repository.OrderLogRepository;
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
	
	@Autowired
	OrderLogRepository orderLogRepository;

	@Autowired
	ItemOrderRepository itemOrderRepo;

	@RequestMapping("/createOrder")
	public String createOrder(OrderCreationDto orderCreationDto) {
			
		Item i = new Item("test", "A");
		itemRepo.save(i);
		
		Item j = new Item("dfgd", "A");
		itemRepo.save(j);
		
		Item k = new Item("dfgdcxvc", "A");
		itemRepo.save(k);
		
//		OrderDto o1 = new OrderDto();
//		o1.setItem(i);
//		o1.setQuantity(2);
//		o1.setTotalPrice(new BigDecimal(20));
//		
//		OrderDto o2 = new OrderDto();
//		o2.setItem(j);
//		o2.setQuantity(1);
//		o2.setTotalPrice(new BigDecimal(20));
//		
//		OrderDto o3 = new OrderDto();
//		o3.setItem(k);
//		o3.setQuantity(20);
//		o3.setTotalPrice(new BigDecimal(100));
//		
//		List<OrderDto> test = Arrays.asList(o1, o2, o3);
		System.out.println(orderCreationDto);
		OrderLog orderLog = (new OrderLog(userRepo.findById(1).get(), new java.sql.Date(new Date().getTime())));

		
		List<ItemOrder> orderList = new ArrayList<>();
		for (OrderDto order : orderCreationDto.getItems()) {
			ItemOrder o = new ItemOrder(order.getQuantity(), order.getTotalPrice(), "");
			o.setItem(order.getItem());
			orderList.add(o);
		}
		
		orderLog.setItemOrder(orderList);
		orderLogRepository.save(orderLog);
		return "home";
	}

	@RequestMapping("getOrders")
	public String getOrders() {
		orderService.getAllOrders();
		return "dashboard";
	}
	
	@RequestMapping("getOrderById")
	public String getOrderById(@RequestParam("id") Integer id) {
		orderService.getOrderById(id);
		return "dashboard";
	}

}
