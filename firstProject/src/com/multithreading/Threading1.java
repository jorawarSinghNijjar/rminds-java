package com.multithreading;

public class Threading1 extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Threading1 t1 = new Threading1();
		t1.start();	
		
		Threading1 t2 = new Threading1();
		t2.start();
		
		Thread t3 = Thread.currentThread();
		System.out.println(t3.getThreadGroup());

		
	}

	@Override
	public void run() {
		System.out.println("Running Thread: " + this.getName());
	}

	
}
