package com.jorawar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class IteratorDemo {

	public static void main(String[] args) {
		// Iterators
		
		Set<Integer> set = new TreeSet<>();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(50);
		set.add(100);
		set.add(40);
		
		System.out.println(set);
		
		Iterator<Integer> it = set.iterator();
		
		int x;
		while(it.hasNext()) {
			x = it.next();
//			System.out.println(x);
			
			if(x >= 50) {
				it.remove();
			}
		
		}
		
		System.out.println(set);
		
		// List Iterator
		System.out.println("List Iterator");
		List<Integer> ls = new ArrayList<>();
		ls.add(10);
		ls.add(20);
		ls.add(30);
		ls.add(50);
		ls.add(100);
		ls.add(40);
		
	
		ListIterator<Integer> lit = ls.listIterator();
		
		System.out.print("[");
		while(lit.hasNext()) {
			System.out.print(lit.next() + ",");
		}
		System.out.print("]");
		System.out.println();
		
		System.out.print("[");
		while(lit.hasPrevious()) {
			System.out.print(lit.previous() + ",");
		}
		System.out.print("]");
		
	}

}
