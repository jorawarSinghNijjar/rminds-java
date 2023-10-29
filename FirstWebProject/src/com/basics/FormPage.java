package com.basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FormPage
 */
@WebServlet("/FormPage")
public class FormPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String fname = "";
	String lname = "";

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Linked to html Get");
		System.out.println(fname + " " + lname);
		fname = request.getParameter("fname");
		lname = request.getParameter("lname");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("Welcome, " + fname + " " + lname);
	}

}
