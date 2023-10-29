package com.basics.SpringJDBCProject;



import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

public class UserDaoImpl implements UserDao {

	private JdbcTemplate jdbcTemplate;

	public int insertOne(User user) {

		String sqlScript = "INSERT INTO user VALUES(?,?,?,?)";
		int i = getJdbcTemplate().update(sqlScript, user.getFirstName(), user.getLastName(), user.getEmail(),
				user.getPassword());
		return i;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int updateOne(User user) {
		String sqlScript = "UPDATE user SET password=? WHERE email=?";
		int i = getJdbcTemplate().update(sqlScript, user.getPassword(), user.getEmail());
		return i;
	}

	public int deleteOne(String email) {
		String sqlScript = "DELETE FROM user WHERE email=?";
		int i = getJdbcTemplate().update(sqlScript, email);
		return i;
	}

	public User findByEmail(String email) {
		String sqlScript = "SELECT * FROM user WHERE email=?";
		UserRowMapper rm = new UserRowMapper();
		User user = getJdbcTemplate().queryForObject(sqlScript, rm, email);
		return user;
	}

	public List<User> getAll() {
		String sqlScript = "SELECT * FROM user";
		UserRowMapper rm = new UserRowMapper();
		List<User> userList = getJdbcTemplate().query(sqlScript, rm);
		return userList;
	}

}
