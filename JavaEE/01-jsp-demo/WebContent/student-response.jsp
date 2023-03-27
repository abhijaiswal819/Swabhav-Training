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
	<!-- <h1>Hello</h1> -->
	<%-- <%
		String firstname=request.getParameter("first_name");
		String lastname=request.getParameter("last_name");
	%>
	<h1>Welcome <%= firstname+" "+lastname %></h1> --%>

	<h1>Welcome ${param.first_name} ${param.last_name}</h1>
	<p>
		Name : ${param.first_name} ${param.last_name}<br> 
		Gender : ${param.gender}<br> 
		Favorite Subject : 
		<ul>
		<%
		String subjects[] = request.getParameterValues("subject");
		for(String x:subjects){
			out.println("<li>"+x+"</li>");
		}
		%>
		</ul>
		Year : ${param.year}<br>
	</p>
</body>
</html>