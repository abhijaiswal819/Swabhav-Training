<%@page import="java.net.URLEncoder"%>
<%@page import="com.sun.org.apache.xerces.internal.xs.StringList"%>
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
		String favCity = request.getParameter("city");
		Cookie theCookie = new Cookie("myApp_favCity", URLEncoder.encode(favCity, "UTF-8"));
		theCookie.setMaxAge(60*60*24*365);//means secs*mins*hrs*days
		response.addCookie(theCookie);
	%>
	
	<a href="cookies-home.jsp">Cookie Home</a>
</body>
</html>