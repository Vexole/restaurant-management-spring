package com.spring.assignment.restaurantmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.assignment.restaurantmanagement.entity.PaymentLog;
import com.spring.assignment.restaurantmanagement.service.PaymentService;

@Controller
public class PaymentController {
	
	@Autowired
	PaymentService paymentService;

	@RequestMapping("/makePayment")
	public String makePayment(PaymentLog paymentLog, Model model) {
		paymentService.makePayment(paymentLog);
		return "home";	
	}
}
