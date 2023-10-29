package com.jorawar;

public class Student implements Comparable<Student>{
	int id;
	String name;
	
	
	
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


// Using id to compare
	
	@Override
	public int compareTo(Student student) {
		if(this.id > student.id) {
			return 0;
		}
		return -1;
	}

	// Using name to compare
//	@Override
//	public int compareTo(Student student) {
//		return this.name.compareTo(student.name);
//	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

	
}
