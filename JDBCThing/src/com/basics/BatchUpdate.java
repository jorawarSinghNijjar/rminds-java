package com.basics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;

public class BatchUpdate {

	public static void main(String[] args) {

		try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/rminds", "root",
				"password"); Statement st = connection.createStatement();) {
			st.addBatch("INSERT INTO account (lastname, firstname, balance) VALUES ('singh', 'test', 8000.23);");
			st.addBatch("INSERT INTO account (lastname, firstname, balance) VALUES ('gill', 'daman', 32000);");
			st.addBatch("INSERT INTO account (lastname, firstname, balance) VALUES ('randhawa', 'chaman', 40000);");
			st.addBatch("INSERT INTO account (lastname, firstname, balance) VALUES ('dhir', 'raman', 6000);");
			int[] i = st.executeBatch();
			System.out.println(Arrays.toString(i));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
