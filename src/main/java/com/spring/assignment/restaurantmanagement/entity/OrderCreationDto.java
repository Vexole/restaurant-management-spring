package com.spring.assignment.restaurantmanagement.entity;

import java.io.Serializable;
import java.util.List;

public class OrderCreationDto implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private List<OrderDto> items;
	private User user;

	public List<OrderDto> getItems() {
		return items;
	}

	public void setItems(List<OrderDto> items) {
		this.items = items;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "OrderCreationDto [items=" + items + ", user=" + user + "]";
	}
}
