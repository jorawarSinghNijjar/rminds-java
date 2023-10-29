package com.basics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatemenThing {

	public static void main(String[] args) {
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/rminds", "root",
					"password");
			PreparedStatement ps = connection
					.prepareStatement("INSERT INTO account (lastname, firstname, balance) VALUES (?,?,?)");
			ps.setString(1, "Nijjar");
			ps.setString(2, "Jorawar");
			ps.setDouble(3, 6400.23);
			ps.executeUpdate();
			System.out.println(ps);
		}

		catch (SQLException e) {
			System.out.println(e);
		}
	}

}
