package com.basics.SpringJDBCProject;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class UserRowMapper implements RowMapper<User>{

	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		User user = new User();
		user.setFirstName(rs.getString(1));
		user.setLastName(rs.getString(2));
		user.setEmail(rs.getString(3));
		user.setPassword(rs.getString(4));
	
		return user;
	}

}
