package com.basics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class ReadConnection {

	public static void main(String[] args) {
		// Clean up JDBC resource automatically because it is in try( resource
		// connection opened )
		try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/rminds", "root",
				"password");
				Statement st = connection.createStatement();
				ResultSet res = st.executeQuery("SELECT * FROM account;");) {

			while (res.next()) {
				int id = res.getInt(1);
				String firstName = res.getString(2);
				String lastName = res.getString(3);
				double balance = res.getDouble(4);
				// -10s means 10 spaces
				// .2 means two decimals
				// %s string
				// %f float and double
				// %n new line
				System.out.printf("| %-10s | %-10s | %-10s | %.2f | %n", id, firstName, lastName, balance);
			}
//			st.close();
//			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
