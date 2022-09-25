package com.onlyxcodes.app.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onlyxcodes.app.model.User;
import com.onlyxcodes.app.repository.UserRepository;

@RestController
@RequestMapping("user")

public class UserController {


	@Autowired
	UserRepository userrepository;
	
	// retrieve all student from database
	@GetMapping("all")
	public List<User> getAllProducts()
	{
		List<User> user=(List<User>) userrepository.findAll();
		return user;
	}



}
