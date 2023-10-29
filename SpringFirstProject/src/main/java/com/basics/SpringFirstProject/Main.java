package com.basics.SpringFirstProject;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		
		Employee emp = (Employee) ctx.getBean("emp");
		
		System.out.println(emp.getId());
		System.out.println(emp.getName());
	}

}
