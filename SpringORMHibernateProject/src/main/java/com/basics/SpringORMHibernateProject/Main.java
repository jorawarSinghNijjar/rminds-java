package com.basics.SpringORMHibernateProject;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		
		ProductDao dao = (ProductDao) ctx.getBean("dao");
		
// ------Create--------
		
//		Product p1 = new Product();
//		p1.setName("Glasses");
//		p1.setDesc("Black rounded glasses");
//		p1.setPrice(45.99);
		
//		Product p1 = new Product();
//		p1.setName("Headphones");
//		p1.setDesc("white");
//		p1.setPrice(99.99);
//		
//		int i = dao.insert(p1);
//		
//		System.out.println(i);
		
//-----------Update-------------
		
//		Product p1 = new Product();
//		p1.setId(69);
//		p1.setName("Glasses");
//		p1.setDesc("Black rounded glasses");
//		p1.setPrice(30.99);
//		
//		dao.update(p1);
		
//--------------Delete-----------------
//		Product pd = new Product();
//		pd.setId(71);
//		dao.delete(pd);
		
// ------------Find product by Id------------------
//		System.out.println(dao.findOne(70));
		
// -------------Get all products-----------------
		List<Product> pl = dao.findAll();
		for(Product p: pl) {
			System.out.println(p);
		}
	}

}
