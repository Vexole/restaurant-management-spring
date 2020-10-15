package com.spring.assignment.restaurantmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.assignment.restaurantmanagement.entity.Payment;
import com.spring.assignment.restaurantmanagement.entity.PaymentLog;
import com.spring.assignment.restaurantmanagement.repository.PaymentRepository;
import com.spring.assignment.restaurantmanagement.service.PaymentService;

@RestController
public class PaymentController {
	
	@Autowired
	PaymentService paymentService;
	
	@Autowired
	PaymentRepository pr;

	@RequestMapping("/makePayment")
	public ResponseEntity<String> makePayment(@RequestBody PaymentLog paymentLog) {
		Payment p = pr.findById(1).get();
		paymentLog.setPayment(p);
		paymentService.makePayment(paymentLog);
		return  ResponseEntity.status(HttpStatus.OK).body("Payment made");	
	}
	
	@RequestMapping("/getAllPayments")
	public ResponseEntity<?> getAllPayments() {		
		return  ResponseEntity.ok(paymentService.getAllPayments());
	}
}
