package com.example.deneme.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.deneme.entities.User;
import com.example.deneme.service.UserService;

@RestController
@RequestMapping("/user")
@CrossOrigin

public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/add")
	public String add(@RequestBody User user) {
		userService.saveUser(user);
		return "New user is added";
	}
	
	@GetMapping("/getAll")
	public List<User> getAllUsers(){
		
		return userService.getAllUsers();
	}

}
