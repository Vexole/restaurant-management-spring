package com.spring.assignment.restaurantmanagement.entity;

import java.math.BigDecimal;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="item_order")
public class ItemOrder {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "quantity")
	private int quantity;

	@Column(name = "price")
	private BigDecimal price;

	@Column(name = "reason")
	private String reason;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "item_id")
	private Item item;


//	@ManyToOne(cascade = { CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
//	@JoinColumn(name = "order_log_id")
//	private OrderLog orderLog;

	
//	@ManyToMany(fetch = FetchType.LAZY, cascade = { CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST,
//			CascadeType.REFRESH })
//	@JoinTable(name = "order_item", joinColumns = @JoinColumn(name = "item_order_id"), 
//	inverseJoinColumns = @JoinColumn(name = "item_id"))
//	private List<Item> items;

	public ItemOrder() {
	}

	public ItemOrder(int quantity, BigDecimal price, String reason) {
		this.quantity = quantity;
		this.price = price;
		this.reason = reason;
	}

//	public void addItem(Item item) {
//		if (items == null) {
//			items = new ArrayList<>();
//		}
//		items.add(item);
//	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

//	public OrderLog getOrderLog() {
//		return orderLog;
//	}
//
//	public void setOrderLog(OrderLog orderLog) {
//		this.orderLog = orderLog;
//	}
//	
	

//	public List<Item> getItems() {
//		return items;
//	}
//
//	public void setItems(List<Item> items) {
//		this.items = items;
//	}
}
