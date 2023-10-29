package com.basics.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.basics.dao.ProductRepository;
import com.basics.entity.Product;

@RestController
public class ProductController {
	@Autowired
	ProductRepository productRepository;
	
	@GetMapping("/products")
	public List<Product> getAll(){
		return productRepository.findAll();
	}
	
//	@GetMapping 
	@RequestMapping(value = "/products/{id}", method=RequestMethod.GET)
	public Product getById(@PathVariable("id") int id) {
		return productRepository.findById(id).get();
	}
	
	@PostMapping(value = "/products")
	public Product saveProduct(@RequestBody Product product) {
		return productRepository.save(product);
	}
	
	@PutMapping(value = "/products")
	public Product updateProduct(@RequestBody Product product) {
		return productRepository.save(product);
	}
	
	@DeleteMapping(value = "/products/{id}")
	public void deleteProduct(@PathVariable("id") int id) {
		productRepository.deleteById(id);
	}
}
