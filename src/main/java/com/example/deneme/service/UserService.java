package com.example.deneme.service;

import java.util.List;

import com.example.deneme.entities.User;

public interface UserService {
	
	public User saveUser(User user);
	public List<User> getAllUsers();
}
