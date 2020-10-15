package com.spring.assignment.restaurantmanagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.spring.assignment.restaurantmanagement.entity.OrderLog;

public interface OrderLogRepository extends CrudRepository<OrderLog, Integer> {
	
	@Query("SELECT ol from OrderLog ol join User u on u.id = ol.user.id where u.userName = :userName")
	List<OrderLog> findByUserName(@Param("userName") String userName);

}
