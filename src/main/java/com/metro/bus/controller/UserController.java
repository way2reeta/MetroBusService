package com.metro.bus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.metro.bus.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService service;
	

}
