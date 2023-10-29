package com.multithreading;

public class ThreadPooling implements Runnable {
	
	private String name;
	
	public ThreadPooling(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()  + " start " + name);
		
		System.out.println(Thread.currentThread().getName()  + " end " + name);
	}

	

}
