package com.multithreading;

public class DisplayMessageThread extends Thread {
	
	private DisplayMessage d1;
	private String name;
	
	
	public DisplayMessageThread(DisplayMessage d1, String name) {
		this.d1 = d1;
		this.name = name;
	}


	@Override
	public void run() {
			d1.showMessage(name);
	}
}
