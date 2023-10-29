package com.multithreading;

public class MultiThreading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread(new Runnable(){

			@Override
			public void run() {
				for(int i=0; i < 10; i++) {
					System.out.println(Thread.currentThread().getName() + " i: " + i);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
			
		});
		
		
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int j=0; j < 10; j++) {
					System.out.println(Thread.currentThread().getName() + " j: " + j);
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
		
		
		t1.start();
		t2.start();
	}

}
