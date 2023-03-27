<%@page import="com.aurionpro.model.StringUtil"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Todays date<%=new Date()%></h1>
	<h2>Hello World in Lower case <%=new String("Hello World in Lower case").toLowerCase()%></h2>

	<br>
	<h3>Scriptlet tags</h3>
	<%
		for (int i = 1; i <= 10; i++) {
		out.println("i : " + i + "<br>");
	}
	%>

	<br>
	<h3>Declaration tags</h3>
	<%-- <%!
		String stringToUpper(String str) {
			return str.toUpperCase();
		}
	%> --%>
	<h2>Hello World in Upper case <%=new StringUtil().stringToUpper("Hello World in Upper case")%></h2>
	
</body>
</html>