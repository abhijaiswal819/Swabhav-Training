	<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="StudentController" method="get">
		<input type="hidden" name="command" value="ADD"/>
		First name <input type="text" name="first_name"/>
		<br><br>
		Last name <input type="text" name="last_name"/>
		<br><br>
		Email <input type="text" name="email"/>
		<br><br>
		<button type="submit">Add Student</button>
	</form>
</body>
</html>