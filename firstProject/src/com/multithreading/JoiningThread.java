package com.multithreading;

public class JoiningThread {

	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("A going to the office");
				for (int i = 0; i < 5; i++) {
					System.out.print("A- ");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println("\nA reached the office\n-----------------");

			}

		});

		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("B going to the office");
				for (int i = 0; i < 5; i++) {
					System.out.print("B- ");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println("\nB reached the office");
			}
		});

		Thread t3 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("C going to the office");
				for (int i = 0; i < 5; i++) {
					System.out.print("C- ");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println("\nC reached the office");
			}
		});

		System.out.println(Thread.currentThread().isAlive());

		t1.start();
		try {
			t1.join(); // t1 thread finishes then other threads would start working after waiting for
						// t1 to finish
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
		System.out.println(t1.getPriority());
		t3.start();

	}

}
