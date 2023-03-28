<%@page import="java.util.ArrayList"%>
<%@ page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="todos.jsp" method=post>
		<input type ="text" name="text" placeholder="Enter text">
		<button type="submit">Submit</button>
	</form>
	
		<ul>
		<%
/* 		session.removeAttribute("todoList");
 */
		List<String> items = (List<String>) session.getAttribute("todoList");
		
		if(items==null){
			items = new ArrayList<>();
		}
		
		String text = request.getParameter("text");
		if(!items.contains(text)){
			items.add(text);

		}
		if(items!=null){
			session.setAttribute("todoList", items);
			for(String x:items){
				if(x!=""){
					out.println("<li>"+x+"</li>");
				}
			}

		}
		%>
		</ul>
	
</body>
</html>