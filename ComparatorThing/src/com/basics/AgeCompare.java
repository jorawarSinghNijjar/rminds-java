package com.basics;

import java.util.Comparator;

public class AgeCompare implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.age > o2.age) {
			return 0;
		}
		return -1;
		
	}

}
