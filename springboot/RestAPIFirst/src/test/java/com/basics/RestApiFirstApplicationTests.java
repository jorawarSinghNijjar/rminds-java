package com.basics;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

import com.basics.entity.Product;

@SpringBootTest
class RestApiFirstApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void testGetProducts() {
		RestTemplate rc = new RestTemplate();
		Product product = rc.getForObject("http://localhost:8080/api/products/70", Product.class);

		assertNotNull(product);
		assertEquals(70, product.getId());
	}

	@Test
	void testPostProduct() {
		Product p = new Product();
		p.setName("Mouse");
		p.setDesc("wireless");
		p.setPrice(62.36);

		RestTemplate rc = new RestTemplate();
		Product product = rc.postForObject("http://localhost:8080/api/products", p, Product.class);

		assertNotNull(product);
		assertEquals("Mouse", product.getName());
	}
	
	@Test
	void testPutProduct() {
		RestTemplate rc = new RestTemplate();
		Product product = rc.getForObject("http://localhost:8080/api/products/70", Product.class);
		
		product.setDesc("Changed the desc");
		
		rc.put("http://localhost:8080/api/products", product);
	}

}
