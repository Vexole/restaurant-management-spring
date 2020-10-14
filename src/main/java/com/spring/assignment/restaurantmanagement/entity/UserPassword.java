package com.spring.assignment.restaurantmanagement.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserPassword {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "password")
	private String password;

	@Column(name = "incorrect_login_attempts")
	private int incorrectLoginAttempts;

	@Column(name = "status")
	private String status;

	@Column(name = "last_logged_in")
	private Date lastLoggedIn;

	public UserPassword() {
	}

	public UserPassword(String password, int incorrectLoginAttempts, String status, Date lastLoggedIn) {
		this.password = password;
		this.incorrectLoginAttempts = incorrectLoginAttempts;
		this.status = status;
		this.lastLoggedIn = lastLoggedIn;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getIncorrectLoginAttempts() {
		return incorrectLoginAttempts;
	}

	public void setIncorrectLoginAttempts(int incorrectLoginAttempts) {
		this.incorrectLoginAttempts = incorrectLoginAttempts;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getLastLoggedIn() {
		return lastLoggedIn;
	}

	public void setLastLoggedIn(Date lastLoggedIn) {
		this.lastLoggedIn = lastLoggedIn;
	}
}
