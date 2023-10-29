package com.multithreading;

public class DisplayMessage {
	public void showMessage(String name) {
		
		for(int i=0; i < 5; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Hello: "+ name);
		}
	}
}
