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

import com.onlyxcodes.app.model.Product;
import com.onlyxcodes.app.repository.ProductRepository;

@RestController
@RequestMapping("products")
public class ProductController {



	@Autowired
	ProductRepository productrepository;
	
	// retrieve all student from database
	@GetMapping("all")
	public List<Product> getAllProducts()
	{
		List<Product> product=(List<Product>) productrepository.findAll();
		return product;
	}
	
	// insert new student into database
	@PostMapping("add")
	public Product addProduct(@RequestBody Product product)
	{
		return productrepository.save(product);
	}
	
	// get particular student by their ID
	@GetMapping("product/{id}")
	public Optional<Product> getProductId(@PathVariable int id)
	{
		return productrepository.findById(id);
	}
	
	/* // update existing student 
	@PutMapping("update/{id}")
	public Student updateStudent(@RequestBody Student student)
	{
		return studentrepository.save(student);
	}
	
	// delete particular student from database
	@DeleteMapping("delete/{id}")
	public void deleteStudent(@PathVariable int id)
	{
		studentrepository.deleteById(id);
	}
	*/
}

