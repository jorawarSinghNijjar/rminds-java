package com.wrapper;

public class MyWrapper {

	public static void main(String[] args) {
		// Uses of Wrapper Classes
		
		String x = "30";
		
//		Wrong way:
//		System.out.println(x + 1); Output = 301
		
//		Correct Way:
		System.out.println(Integer.parseInt(x) + 1);
		
		// For decimal
		System.out.println(Double.parseDouble(x) + 1);
	}

}
