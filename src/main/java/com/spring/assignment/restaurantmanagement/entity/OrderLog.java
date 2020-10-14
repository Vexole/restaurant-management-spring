package com.spring.assignment.restaurantmanagement.entity;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class OrderLog {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@ManyToOne(cascade = { CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
	@JoinColumn(name = "user_id")
	private User user;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "order_log_id")
	private List<ItemOrder> itemOrder;

	@Column(name = "order_date")
	private Date orderDate;
	
	@OneToOne(mappedBy="orderLog")
	private PaymentLog paymentLog;

	public OrderLog() {
	}

	public OrderLog(User user, Date orderDate) {
		this.user = user;
		this.orderDate = orderDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public List<ItemOrder> getItemOrder() {
		return itemOrder;
	}

	public void setItemOrder(List<ItemOrder> itemOrder) {
		this.itemOrder = itemOrder;
	}

	public PaymentLog getPaymentLog() {
		return paymentLog;
	}

	public void setPaymentLog(PaymentLog paymentLog) {
		this.paymentLog = paymentLog;
	}	
}
