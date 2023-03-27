<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="student-response.jsp" method="get">
		First Name :<br><input type="text" name="first_name" placeholder="First Name" /><br>
		<br>
		Last Name :<br><input type="text" name="last_name" placeholder="Last Name" /><br>
		<br>
		Gender :<br><input type="radio" name="gender" value="MALE" />
  				<label for="MALE">MALE</label><br>
				<input type="radio" name="gender" value="FEMALE" />
  				<label for="FEMALE">FEMALE</label><br>
		<br>
		Favorite Subject : <br><input type="checkbox" id="subject1" name="subject" value="Maths">
  							<label for="Maths"> Maths</label><br>
  							<input type="checkbox" id="subject2" name="subject" value="CS">
  							<label for="CS"> CS</label><br>
		<br>
		Year : <label for="year">Choose Year:</label>
  				<select name="year" id="year">
    				<option value="FE">FE</option>
    				<option value="SE">SE</option>
    				<option value="TE">TE</option>
    				<option value="BE">BE</option>
  				</select>
  		<br>
		<button type="submit">Submit</button>
	</form>
	

</body>
</html>