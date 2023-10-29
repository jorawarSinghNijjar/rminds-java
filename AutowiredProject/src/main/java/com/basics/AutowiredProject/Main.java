package com.basics.AutowiredProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		
		Employee emp = (Employee) context.getBean("emp");
		
		Address address;
		
		System.out.println(emp);
	}
}
