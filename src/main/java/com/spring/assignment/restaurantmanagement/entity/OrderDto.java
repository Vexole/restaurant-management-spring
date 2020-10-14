package com.spring.assignment.restaurantmanagement.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class OrderDto implements Serializable {

	private Item item;

	private int quantity;

	private BigDecimal totalPrice;

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(BigDecimal totalPrice) {
		this.totalPrice = totalPrice;
	}

	@Override
	public String toString() {
		return "OrderDto [item=" + item + ", quantity=" + quantity + ", totalPrice=" + totalPrice + "]";
	}

	
}
