package com.jorawar;

import java.io.Serializable;

public class Employee implements Serializable{
	
	private static final long serialVersionUID = 7288317051430172737L;
	private int id;
	private String name;
	private int salary;
	private transient int departmentId;
	
	public Employee(int id, String name, int salary,int departmentId) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.departmentId = departmentId;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", departmentId=" + departmentId + "]";
	}

	
	
	
}
