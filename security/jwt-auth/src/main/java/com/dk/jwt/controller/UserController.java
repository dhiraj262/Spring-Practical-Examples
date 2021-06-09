package com.dk.jwt.controller;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dk.jwt.entity.User;
import com.dk.jwt.service.UserService;

@RestController
@CrossOrigin
public class UserController {

	@Autowired
	private UserService userService;
	
	@PostConstruct
    public void initRoleAndUser() {
        userService.initRoleAndUser();
    }

	@PostMapping("/registerUser")
	public User registerUser(@RequestBody User user) {
		return userService.registerUser(user);
	}

	@GetMapping("/admin")

	public String forAdmin() {
		return "This URL is only accessible to the admin";
	}

	@GetMapping("/user")
	public String forUser() {
		return "This URL is only accessible to the user";
	}

}
