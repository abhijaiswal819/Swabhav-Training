<%@page import="com.sun.org.apache.xerces.internal.xs.StringList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.net.URLDecoder"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		String favCity = null;
	Cookie[] theCookies = request.getCookies();

	if (theCookies != null) {
		for (Cookie tempCookie : theCookies) {
			if ("myApp_favCity".equals(tempCookie.getName())) {
		favCity = URLDecoder.decode(tempCookie.getValue(), "UTF-8");
		break;
			}
		}
	}

	if (favCity != null) {
		out.println("<h2> Favorite City : " + favCity + "</h2>");
	}
	%>
	<a href="cookies-form.jsp">Form Home</a>

</body>
</html>