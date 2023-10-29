package com.jorawar;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		
		Set<Integer> set = new HashSet<>();
		// No duplicates and Order not maintained
		set.add(10);
		set.add(10);
		set.add(40);
		set.add(100);
		
		System.out.println(set);
		
		
		// LinkedHashSet
		// Insertion  order is maintained
		Set<Integer> lhs = new LinkedHashSet<Integer>();
		lhs.add(10);
		lhs.add(10);
		lhs.add(40);
		lhs.add(100);
		
		System.out.println(lhs);
		
		// TreeSet
		
		List<Integer> ls = new ArrayList<>();
		Random r = new Random();
		
		for(int i=0; i < 10; i++) {
			int j = r.nextInt(10);
			ls.add(j);
		}
		
		System.out.print("List-->");
		System.out.println(ls);
		System.out.println();
		
		System.out.print("HashSet-->");
		Set<Integer> hs = new HashSet<Integer>(ls);
		System.out.println(hs);
		System.out.println();
		
		System.out.print("LinkedHashSet-->");
		Set<Integer> lhs2 = new LinkedHashSet<Integer>(ls);
		System.out.println(lhs2);
		System.out.println();
		
		System.out.print("TreeSet-->");
		Set<Integer> ts = new TreeSet<Integer>(ls);
		System.out.println(ts);
		System.out.println();
		
		Set<String> ss = new HashSet<>();
		ss.add("Hello");
		ss.add("Bye");
		ss.add("Hello");
		ss.add("hello");
		ss.add(new String("Hello"));
		
		System.out.print("HashSet String-->");
		System.out.println(ss);
	}

}
