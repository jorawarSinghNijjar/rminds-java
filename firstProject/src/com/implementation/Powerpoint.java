package com.implementation;

public class Powerpoint implements Office {

	@Override
	public void open() {
		System.out.println("Open Powerpoint Document");
	}

	@Override
	public void close() {
		System.out.println("Close Powerpoint Document");
		
	}
}
