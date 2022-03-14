package com.nfittipaldi.application.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nfittipaldi.application.models.User;
import com.nfittipaldi.application.repositories.UserRepository;

@RestController
@RequestMapping("/api/v1/userController/")
public class UserController {

	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/getUser")
	public User getUser(@RequestBody String username) {
		return null;
	}
}
