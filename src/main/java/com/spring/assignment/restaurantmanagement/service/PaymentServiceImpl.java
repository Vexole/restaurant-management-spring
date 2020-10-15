package com.spring.assignment.restaurantmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.assignment.restaurantmanagement.entity.PaymentLog;
import com.spring.assignment.restaurantmanagement.repository.PaymentLogRepository;
import com.spring.assignment.restaurantmanagement.utils.UserUtils;

@Service
public class PaymentServiceImpl implements PaymentService {
	
	@Autowired
	PaymentLogRepository paymentRepository;

	@Override
	public void makePayment(PaymentLog paymentLog) {
		paymentRepository.save(paymentLog);
	}

	@Override
	public void getPaymentByOrderLogId(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<PaymentLog> getAllPayments() {
		return paymentRepository.findByUserName(UserUtils.getUserName());
//		return (List<PaymentLog>) paymentRepository.findAll();
	}

}
