package com.problem;

import java.util.ArrayList;
import java.util.List;

public class ProductProblem {

	public static void main(String[] args) {

		List<Product> products = new ArrayList<>();

		products.add(new Product(1, "Pen", 1.00));
		products.add(new Product(2, "Notebook", 6.00));
		products.add(new Product(3, "Mouse", 60.00));
		products.add(new Product(4, "Keyboard", 80.00));
		products.add(new Product(5, "Speakers", 150.00));
		products.add(new Product(6, "Torch", 15.00));
		products.add(new Product(7, "Webcam", 30.00));

		// User Stream api to solve these problems

		// 1 - Find the product with maximum price

//		Product maxPriceProduct = products.stream().max((p1, p2) -> p1.getPrice() > p2.getPrice() ? 1 : -1)
//				.orElse(null);
		Product maxPriceProduct = products.stream().max(Product::compareTo).orElse(null);
		System.out.println("\nMax Price Product: " + maxPriceProduct);
		
		// 2 - Find the product with minimum price
		
		Product minPriceProduct = products.stream().min((p1, p2) -> p1.getPrice() > p2.getPrice() ? 1 : -1)
				.orElse(null);
		System.out.println("\nMin Price Product" + minPriceProduct);
		
		// 3 - Add prices of all the products
		
		double sum = products.stream().map(p -> p.getPrice()).reduce(Double::sum).orElse(0.00);
		System.out.println("\nSum of all products: " + sum);
		
		
		
	}

}
