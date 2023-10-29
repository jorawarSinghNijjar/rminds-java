package com.staticblocks;

public class Employee {
	
	int salary;
	
	static {
		System.out.println("Static Employee Call");
	}

}
