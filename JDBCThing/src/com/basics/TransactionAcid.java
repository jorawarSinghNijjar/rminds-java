package com.basics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;



public class TransactionAcid {

	public static void main(String[] args) {
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/rminds", "root",
					"password");
//			connection.setAutoCommit(false);
			Statement st = connection.createStatement();
			st.executeUpdate("UPDATE account SET balance=balance - 100 WHERE accno = 1");
			st.executeUpdate("UPDATE account SET balance=balance + 100 WHERE accno = 2");

//			connection.commit();
			
		}

		catch (SQLException e) {
			System.out.println(e);
		}

	}

}
