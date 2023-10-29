package com.basics;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Main {

	public static void main(String[] args) {
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.config.xml").build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
		Transaction tr = session.beginTransaction();

		Student s1 = new Student("Akash", "akash@test.com");
		Address a1 = new Address("8 Cumbrian Crt", "Brampton", "ON", "Canada", "L6X 2J8");
		
		s1.setAddress(a1);
		a1.setStudent(s1);
		
		session.persist(s1);
		
		tr.commit();
		session.close();
		factory.close();
		
		System.out.println("Data saved successfully");
	}

}
