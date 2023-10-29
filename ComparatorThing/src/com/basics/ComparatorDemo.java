package com.basics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Student s1 = new Student(1, "Zenda");
				Student s2 = new Student(2, "Bamboo");
				Student s3 = new Student(3, "Mandy");
				Student s4 = new Student(4, "Linty");
				
				List<Student> cl = new ArrayList<>();
				
				cl.add(s3);
				cl.add(s4);
				cl.add(s2);
				cl.add(s1);
				
				
				System.out.println(cl);
				
				Collections.sort(cl, new AgeCompare());
				
//				Collections.sort(cl, new NameCompare());
				System.out.println(cl);
	}

}
