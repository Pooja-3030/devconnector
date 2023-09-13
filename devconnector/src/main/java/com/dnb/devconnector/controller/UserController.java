package com.dnb.devconnector.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dnb.devconnector.dto.User;

@RestController
@RequestMapping("api/User")
public class UserController {
	@PostMapping("/create")
	public User createUser(@RequestBody User user) {
		return user;
		
	}

}
