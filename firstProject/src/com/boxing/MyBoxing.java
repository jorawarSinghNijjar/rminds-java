package com.boxing;

import java.util.ArrayList;

public class MyBoxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		
		// Boxing
		Integer X = Integer.valueOf(x);
		System.out.println(X.getClass());

		// Unboxing
		x = X.intValue();
		
		
		//----------------- Uses of Boxing---------------
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(5); // Boxing - int to Integer
		int value = numbers.get(0); // Unboxing - Integer to int

	}

}
