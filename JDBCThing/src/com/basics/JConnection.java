package com.basics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JConnection {

	public static void main(String[] args) {
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/rminds", "root",
					"password");

			Statement st = connection.createStatement();
			int i = st.executeUpdate(
					"INSERT INTO account (lastname, firstname, balance) VALUES (\"singh\", \"test\", 8000.23);");
			System.out.println(i);
			st.close();
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
