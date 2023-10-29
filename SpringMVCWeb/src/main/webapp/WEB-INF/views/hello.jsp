<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hello</title>
</head>
<body>
<h1>Data from controller</h1>

<%
	Integer id = (Integer) request.getAttribute("id");
	String name = (String) request.getAttribute("name");
	
	out.print(id + " : ");
	out.print(name);
%>
</body>
</html>