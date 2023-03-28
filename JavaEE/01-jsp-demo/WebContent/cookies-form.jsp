<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="cookies-response.jsp" method="get">
		City : <label for="city">Choose city:</label>
  				<select name="city" id="year">
    				<option value="Mumbai">Mumbai</option>
    				<option value="Navi Mumbai">Navi Mumbai</option>
    				<option value="Thane">Thane</option>
    				<option value="Kya Pta">Kya Pta</option>
  				</select>
  		<br>
		<button type="submit">Submit</button>	
	</form>
</body>
</html>