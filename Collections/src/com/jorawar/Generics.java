package com.jorawar;

import java.util.ArrayList;

public class Generics {

	public static void main(String[] args) {
		
		// List with specific type <class>
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(4);
		list.add(4985);
		
		//compile time error
//		list.add(2312.021); // double not allowed only integers
	}

}
