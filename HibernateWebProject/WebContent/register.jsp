<%@page import="com.basics.RegisterData"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register Page</title>
</head>
<body>
<jsp:useBean id="user1" class="com.basics.User"></jsp:useBean>

<jsp:setProperty property="*" name="user1"/>

<%
	int i = RegisterData.register(user1);

	if(i > 0){
		out.print("User data saved successfully");
	}
	else{
		out.print("Not saved !!");
	}
%>

</body>
</html>