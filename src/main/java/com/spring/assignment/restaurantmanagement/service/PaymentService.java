package com.spring.assignment.restaurantmanagement.service;

import java.util.List;

import com.spring.assignment.restaurantmanagement.entity.PaymentLog;

public interface PaymentService {
	
	public void makePayment(PaymentLog paymentLog);
	
	public void getPaymentByOrderLogId(int id);

	public List<PaymentLog> getAllPayments();

}
