package com.basics;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.basics.model.Product;
import com.basics.repository.ProductRepository;

@SpringBootTest
class SpringbootDbApplicationTests {
	
	@Autowired
	ProductRepository repository;

	@Test
	void contextLoads() {
	}
	
	@Test
	void testInsert() {
		repository.save(new Product("Iphone", "black", 500.00));
	}
	
	@Test
	void testUpdate() {
		Product updatedProduct = repository.findById(69).get();
		updatedProduct.setPrice(489.00);
		
		repository.save(updatedProduct);
	}
	
	@Test
	void testGetAll() {
		List<Product> products = (List<Product>) repository.findAll();
		System.out.println(products);
	}
	
	@Test
	void testGetById() {
		Product product = repository.findById(69).get();
		assertNotNull(product);
		assertEquals(489.00, product.getPrice());
	}

}
