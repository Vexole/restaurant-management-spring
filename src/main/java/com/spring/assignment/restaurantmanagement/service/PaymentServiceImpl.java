package com.spring.assignment.restaurantmanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.assignment.restaurantmanagement.entity.PaymentLog;
import com.spring.assignment.restaurantmanagement.repository.PaymentRepository;

@Service
public class PaymentServiceImpl implements PaymentService {
	
	@Autowired
	PaymentRepository paymentRepository;

	@Override
	public void makePayment(PaymentLog paymentLog) {
		paymentRepository.save(paymentLog);
	}

	@Override
	public void getPaymentByOrderLogId(int id) {
		// TODO Auto-generated method stub
		
	}

}
