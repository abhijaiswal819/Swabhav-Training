<%@page import="com.aurionpro.model.student"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		student st1 = new student("Ram", 11, true, "ram@gmail.com");
		student st2 = new student("SAM", 12, false, "sam@gmail.com");
		student st3 = new student("KAM", 13, true, "kam@gmail.com");
		student st4 = new student("JAM", 14, false, "jam@gmail.com");
		student st5 = new student("GAM", 15, true, "gam@gmail.com");

		student students[] = {st1, st2, st3, st4, st5};
		pageContext.setAttribute("studentList", students);
	%>
	
	<table border = "1" style="border: 3px solid black; ">
	<th>Name</th>
	<th>Roll No</th>
	<th>Scholarship</th>
	<th>Email</th>
	<c:forEach var="stud" items="${studentList}">
		<tr>
			<td>${stud.name}</td>
			<td>${stud.rollno}</td>
			<c:if test="${stud.scholarship == true }">
				<td>YES</td>
			</c:if>
			<c:if test="${stud.scholarship == false }">
				<td>NO</td>
			</c:if>
<%-- 			<td>${stud.scholarship}</td>
 --%>			<td>${stud.email}</td>
		</tr>
 	</c:forEach>
 	</table>
</body>
</html>