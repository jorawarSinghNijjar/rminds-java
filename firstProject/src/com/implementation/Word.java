package com.implementation;

public class Word implements Office{

	@Override
	public void open() {
		System.out.println("Open Word Document");
	}

	@Override
	public void close() {
		System.out.println("Close Word Document");
		
	}
	
}
