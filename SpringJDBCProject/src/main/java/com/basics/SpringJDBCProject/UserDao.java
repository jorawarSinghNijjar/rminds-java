package com.basics.SpringJDBCProject;

import java.util.List;

public interface UserDao {
	
	int insertOne(User user);
	int updateOne(User user);
	int deleteOne(String email);
	User findByEmail(String email);
	List<User> getAll();
}
