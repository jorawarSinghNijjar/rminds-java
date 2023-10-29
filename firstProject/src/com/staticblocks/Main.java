package com.staticblocks;

public class Main {

	/**
	 * @param args
	 */
	static int num = 10;
	public static void main(String[] args) {
		staticMethod();
		Employee e = new Employee();
		System.out.println("Main Call");
		System.out.println(num);
	}
	
	static {
		int num = 20; // Block level scope of num so, no re declaration error
		System.out.println(num);
		
		System.out.println("Static Block Call");
	}
	
	static void staticMethod() {
		System.out.println("Static Method Call");
	}
}
