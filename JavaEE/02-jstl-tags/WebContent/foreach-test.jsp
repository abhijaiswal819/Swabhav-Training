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
		String subjects[] = {"Java", "C++", "JS", "Python"};
		pageContext.setAttribute("mySubjects", subjects);
	%>

	<c:forEach var="sub" items="${mySubjects}">
<%--  	<c:out value="${sub}"><br></c:out>
 --%>	
 		${sub}<br>
 	</c:forEach>
</body>
</html>