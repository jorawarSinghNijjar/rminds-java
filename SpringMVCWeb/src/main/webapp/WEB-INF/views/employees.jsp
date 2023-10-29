<%@page import="java.util.List"%>
<%@page import="com.basics.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employees</title>
</head>
<body>

	<h3>All Employees</h3>
	<%
		List<Employee> list = (List<Employee>) request.getAttribute("list");
		out.print("<ol>");
		for (Employee emp : list) {

			out.print("<li> Name: " + emp.getName() + "<br/>");
			out.print("Salary: " + emp.getSalary() + "</li>");

		}

		out.print("</ol>");
	%>
</body>
</html>