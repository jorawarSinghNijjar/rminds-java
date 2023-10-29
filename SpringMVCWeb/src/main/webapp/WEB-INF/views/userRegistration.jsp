<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Registration</title>
</head>
<body>

	<form action="register" method="POST">
		<label for="name">Name: </label>
		<input type="text" name="name" />
		
		<br/>
		<br/>
		
		<label for="email">Email: </label>
		<input type="text" name="email" />
		<br />
		<br/>
		
		<input type="submit" value="register" /> 
	</form>
</body>
</html>