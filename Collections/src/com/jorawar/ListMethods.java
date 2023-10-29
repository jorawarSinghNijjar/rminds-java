package com.jorawar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListMethods {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=10; i <= 100; i+=10) {
			list.add(i);
		}
		
		System.out.println(list);
		
		// Add
		list.add(2,100);
		System.out.println(list);
		
		// Replace
		list.set(2, 200);
		System.out.println(list);
		
		// Remove
		list.remove(2);
		System.out.println(list);
		
		
		List<Integer> onlyList = new ArrayList<>();
		onlyList.add(299);
		onlyList.add(234);
		onlyList.add(90);
		
		System.out.println(onlyList);
		
		// Merge two lists
		list.addAll(2,onlyList);	
		System.out.println(list);
	
	}

}
