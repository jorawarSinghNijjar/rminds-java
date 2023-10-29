package com.basics;

import java.util.ArrayList;
import java.util.List;

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
		
		Doctor doc1 = new Doctor();
		doc1.setName("Gill");
		
		Patient p1 = new Patient();
		p1.setName("Amar");
		p1.setProblem("Tuberculosis");
		
		Patient p2 = new Patient();
		p2.setName("Dumpy");
		p2.setProblem("Asthama");

		
		List<Patient> doc1Patients = new ArrayList<Patient>();
		doc1Patients.add(p1);
		doc1Patients.add(p2);
		
		doc1.setPatients(doc1Patients);
		
		Doctor doc2 = new Doctor();
		doc2.setName("Raymond");
		
		Patient p3 = new Patient();
		p3.setName("Babel");
		p3.setProblem("Fever");

		
		Patient p4 = new Patient();
		p4.setName("Ciaz");
		p4.setProblem("Headache");
		
		List<Patient> doc2Patients = new ArrayList<Patient>();
		doc2Patients.add(p3);
		doc2Patients.add(p4);
		
		doc2.setPatients(doc2Patients);
		
		session.persist(doc1);
		session.persist(doc2);

		
		tr.commit();
		session.close();
		factory.close();
		
		System.out.println("Data saved successfully"); 

	}

}
