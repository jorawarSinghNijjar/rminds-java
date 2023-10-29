package com.multithreading;

public class MainInterrupt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterruptExample i1 = new InterruptExample();
		InterruptExample i2 = new InterruptExample();
		i1.start();
		i1.interrupt();
		i2.start();
		
	}

}
