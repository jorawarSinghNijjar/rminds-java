package com.multithreading;

public class RunningThread implements Runnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RunningThread r1 = new RunningThread();
		
		Thread t1 = new Thread(r1);
		t1.start();
	}

	@Override
	public void run() {
		System.out.println("Thread Running: ");
	}

}
