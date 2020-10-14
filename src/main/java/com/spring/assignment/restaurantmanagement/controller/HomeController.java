package com.spring.assignment.restaurantmanagement.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.assignment.restaurantmanagement.Status;
import com.spring.assignment.restaurantmanagement.entity.RegisterDto;
import com.spring.assignment.restaurantmanagement.entity.User;
import com.spring.assignment.restaurantmanagement.entity.UserPassword;
import com.spring.assignment.restaurantmanagement.repository.UserRepository;

@Controller
public class HomeController {

	@Autowired
	private UserRepository userRepository;

	@RequestMapping("loginFormSubmit")
	public String loginFormSubmit(@RequestParam("userName") String userName, @RequestParam("password") String password,
			Model model) {
		model.addAttribute("userName", userName);
		model.addAttribute("password", password);
		return "dashboard";
	}

	@RequestMapping("registerFormSubmit")
	public String registerFormSubmit(RegisterDto registerDto, Model model) {
		User user = new User(registerDto.getFirstName(), registerDto.getLastName(), registerDto.getUserName(),
				registerDto.getEmail(), Status.ACTIVE.toString());
		user.setCreatedDate(new java.sql.Date(new Date().getTime()));
		user.setUserPassword(new UserPassword(registerDto.getPassword(), 0, Status.ACTIVE.toString(), new java.sql.Date(new Date().getTime())));
		userRepository.save(user);
		
		
		return "dashboard";
	}

	@RequestMapping("/data")
	public String getData(@RequestParam("name") String name) {
		System.out.println(name);
		return "home";
	}

	@RequestMapping("/home")
	public String home() {
		return "home";
	}

	@RequestMapping("/login")
	public String login() {
		return "login-form";
	}

	@RequestMapping("/register")
	public String register(Model model) {
		return "registration";
	}

	@RequestMapping("/dashboard")
	public String home(Model model) {
		return "dashboard";
	}
}
