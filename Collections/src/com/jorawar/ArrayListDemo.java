package com.jorawar;

import java.util.ArrayList;

public class ArrayListDemo {
	
	private String name = "John";
	
	

	public ArrayListDemo(String name) {
		super();
		this.name = name;
	}


	public static void main(String[] args) {
		// Heterogeneous Arraylist
		ArrayList list = new ArrayList();
		
		list.add(4);
		list.add("4");
		list.add('4');
		list.add(new Integer(4));
		list.add("Hello");
		
		ArrayListDemo ald = new ArrayListDemo("John");
		
		list.add(ald);
		
		System.out.println(list);
		
		//Runtime cast checking (java.lang.ClassCastException)
		String s = (String) list.get(0);
		System.out.println(s);
		
	}

}
