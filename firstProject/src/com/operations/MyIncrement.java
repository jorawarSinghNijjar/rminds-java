package com.operations;

public class MyIncrement {

	public static void main(String[] args) {
		int i = 10;
		int withIncrement, withoutIncrement;
		
		withIncrement = ++i; //Assigns value of i after increment
		withoutIncrement = i++; //Assigns value of i after increment
		
		System.out.println("i = " + i);
		System.out.println("withIncrement = " + withIncrement);
		System.out.println("withoutIncrement = " + withoutIncrement);
		System.out.println(i++);
		System.out.println(i++);
		System.out.println(i);
	}

}
