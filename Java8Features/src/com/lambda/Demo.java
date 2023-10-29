package com.lambda;

public class Demo {
	public static void main(String[] args) {
		// Anonymous inner class
		College c = new College() {
			public void addStudent(String collegeName) {
				System.out.println("Students list from college: " + collegeName );
			};
		};
		c.addStudent("Andy");
		
		// Lambda Expression
		College d = (collegeName) -> System.out.println("Student List from college: " + collegeName );
		d.addStudent("Herzing");
		
		Calculate add = (x,y) -> x+y;
		System.out.println(add.getResult(20,30));
		
		
	}
}
