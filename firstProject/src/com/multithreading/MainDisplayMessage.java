package com.multithreading;

public class MainDisplayMessage {

	public static void main(String[] args) {
		DisplayMessage d1 = new DisplayMessage();
		DisplayMessageThread t1 = new DisplayMessageThread(d1, "John");
		DisplayMessageThread t2 = new DisplayMessageThread(d1, "Baxter");
		DisplayMessageThread t3 = new DisplayMessageThread(d1, "Tom");
		
		t1.start();
		t2.start();
		t3.start();
		
	}

}
