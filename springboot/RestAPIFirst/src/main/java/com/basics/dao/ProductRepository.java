package com.basics.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.basics.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
