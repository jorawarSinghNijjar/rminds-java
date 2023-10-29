package com.basics.SpringJDBCProject;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		
//		JdbcTemplate jdbc = (JdbcTemplate) context.getBean("jdbcTemplate");
//		String sqlScript = "INSERT INTO user VALUES(?,?,?,?)";
//		int i = jdbc.update(sqlScript, "amber","gill","gill@test.com","abc");
		
		UserDao userDao = (UserDao) context.getBean("userDao");
//		User user1 = new User();
//		user1.setFirstName("Danny");
//		user1.setLastName("Ahmed");
//		user1.setEmail("ahmed@test.com");
//		user1.setPassword("12345");
		
//		
//		int i = userDao.insertOne(user1);
//		int i = userDao.updateOne(user1);
//		int i = userDao.deleteOne("ahmed@test.com");
//		User user = userDao.findByEmail("john@gmail.com");
		
		List<User> ul = userDao.getAll();
		
		for(User user: ul) {
			System.out.println(user);
		}
//		System.out.println(ul);
//		System.out.println(i == 1 ? "Success":"Failed");
	}
}
