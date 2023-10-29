package com.basics.repository;

import org.springframework.data.repository.CrudRepository;

import com.basics.model.Product;

public interface ProductRepository extends CrudRepository<Product, Integer>{
	
}
