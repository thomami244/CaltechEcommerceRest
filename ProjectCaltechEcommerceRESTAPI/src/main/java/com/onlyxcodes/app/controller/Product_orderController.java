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

import com.onlyxcodes.app.model.Product_order;
import com.onlyxcodes.app.repository.Product_orderRepository;

@RestController
@RequestMapping("order")

public class Product_orderController {



	@Autowired
	Product_orderRepository product_orderrepository;
	
	// retrieve all student from database
	@GetMapping("all")
	public List<Product_order> getAllProducts()
	{
		List<Product_order> product_order=(List<Product_order>) product_orderrepository.findAll();
		return product_order;
	}
	
	/*// insert new student into database
	@PostMapping("add")
	public Product addProduct(@RequestBody Product product)
	{
		return productrepository.save(product);
	}
	
	// get particular student by their ID
	@GetMapping("product/{id}")
	public Optional<Product> getProductId(@PathVariable int id)
	{
		return productrepository.findById(id);*/
	}
