package com.basics;

//Cannot implement both with same method No()
//class Z implements X,Y{

class Z implements X,Y{

	@Override
	public void hello() {
		System.out.println("Hello");
	}
	// No need to implement default method No if not necessary

	@Override
	public void bye() {
		Y.super.bye(); // We can choose which interface method to use
	}

}

public class Main {

	public static void main(String[] args) {
		X x = new Z();
		x.hello();
		x.bye();
		
		Y  y = new Z();
//		y.hello(); // Not available in  Y
		y.bye();
	}

}
