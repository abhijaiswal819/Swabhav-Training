<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:forEach var="item" items="${itemList}">
		<p>${item}</p>
	</c:forEach>
</body>
</html>