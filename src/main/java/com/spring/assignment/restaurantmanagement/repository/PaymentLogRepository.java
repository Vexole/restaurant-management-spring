package com.spring.assignment.restaurantmanagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.spring.assignment.restaurantmanagement.entity.PaymentLog;

public interface PaymentLogRepository extends CrudRepository<PaymentLog, Integer> {
	
	@Query(value = "SELECT * FROM PAYMENT_LOG pl JOIN ORDER_LOG ol ON pl.order_log_id = ol.id where ol.user_id = (select id from user where user_name=:userName)",  nativeQuery = true)
	List<PaymentLog> findByUserName(@Param("userName") String userName);


}
