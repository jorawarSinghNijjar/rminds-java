package com.basics;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ReadServlet
 */
@WebServlet(urlPatterns = "/ReadServlet")
public class ReadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	Connection connection;
	Statement st;

	public void init() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/rminds", "root", "password");
			st = connection.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		try {
			ResultSet res = st.executeQuery("SELECT * FROM user");
			// response
			out.print("<body>");
			out.print("<table border='1'>" + "<thead>" + "<tr>" + "<th>First Name</th>" + "<th>Last Name</th>"
					+ "<th>Email</th>" + "<th>Password</th>" + "<th>Actions</th>" + "</tr>" + "</thead>");

			out.print("<tbody>");

			while (res.next()) {
				out.print("<tr>");
				out.print("<td>" + res.getString(1) + "</td>");
				out.print("<td>" + res.getString(2) + "</td>");
				out.print("<td>" + res.getString(3) + "</td>");
				out.print("<td>" + res.getString(4) + "</td>");
				out.print(
						"<td><form action='DeleteServlet' method='POST'><input name='email' value='" + res.getString(3)
								+ "'style='display:none'/><input type='submit' value='Delete'/></form></td>");
				out.print("</tr>");
			}

			out.print("</tbody>" + "</table>");
			out.print("</body>");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void destroy() {
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
