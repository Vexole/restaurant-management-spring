package com.spring.assignment.restaurantmanagement.utils;

import org.springframework.security.core.context.SecurityContextHolder;

public class UserUtils {
	public static String getUserName() {
		return SecurityContextHolder.getContext().getAuthentication().getName();
	}
}
