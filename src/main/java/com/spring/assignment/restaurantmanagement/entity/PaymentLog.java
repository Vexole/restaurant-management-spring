package com.spring.assignment.restaurantmanagement.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class PaymentLog {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@OneToOne
	@JoinColumn(name = "payment_id")
	private Payment payment;

	@OneToOne
	@JoinColumn(name = "order_log_id")
	private OrderLog orderLog;

	@Column(name = "status")
	private String status;

	@Column(name = "total")
	private BigDecimal total;

	public PaymentLog() {
	}

	public PaymentLog(Payment payment, OrderLog orderLog, String status, BigDecimal total) {
		this.payment = payment;
		this.orderLog = orderLog;
		this.status = status;
		this.total = total;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public OrderLog getOrderLog() {
		return orderLog;
	}

	public void setOrderLog(OrderLog orderLog) {
		this.orderLog = orderLog;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "PaymentLog [id=" + id + ", payment=" + payment + ", orderLog=" + orderLog + ", status=" + status
				+ ", total=" + total + "]";
	}
}
