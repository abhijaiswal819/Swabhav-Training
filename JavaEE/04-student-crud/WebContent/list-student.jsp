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
		<input type="text" name="name"/>
		<input type="hidden" name="command" value="SEARCH"/>
		<button type="submit">Search User by Name</button>
	</form>
	<br><br>
	<table border="1">
		<tr>
			<!-- <th>ID</th> -->
			<th>Sr. No.</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Email</th>
			<th>Update</th>
			<th>Delete</th>
		</tr>

		<c:set var="count" value="0"/>
		<c:forEach var="student" items="${students}">
			<c:url var="updateLink" value="StudentController">
				<c:param name="command" value="LOAD"/>
				<c:param name="studentId" value="${student.id}" />
			</c:url>
			
			<c:url var="deleteLink" value="StudentController">
				<c:param name="command" value="DELETE"/>
				<c:param name="studentId" value="${student.id}" />
			</c:url>
			
			<tr>
				<%-- <td>${student.id}</td> --%>
				<c:set var="count" value="${count + 1}"/>
				<td>${count}</td>
				<td>${student.firstName}</td>
				<td>${student.lastName}</td>
				<td>${student.email}</td>
				<td><button onclick="window.location.href='${updateLink}'">Update</button></td>
				<td><button onclick="window.location.href='${deleteLink}'">Delete</button></td>

			</tr>
		</c:forEach>
	</table>
	<br>
	<br> Add new Student
	<button onclick="window.location.href='add-student.jsp'">Add
		Student</button>

</body>
</html>