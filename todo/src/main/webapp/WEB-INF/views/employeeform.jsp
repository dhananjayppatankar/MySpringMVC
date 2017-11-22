<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<a href="/todo">Home</a>
	<div align="center">
	<h1 align="center"> Employee Registration Form </h1>
	<form action="employeeSuccess" method="post">
		<table>
			<tr>
				<td>Employee Name :</td>
				<td><input type="text" name="ename" /></td>
			</tr>

			<tr>
				<td>Address :</td>
				<td><input type="text" name="address" /></td>
			</tr>

			<tr>
				<td>Salary :</td>
				<td><input type="text" name="salary" /></td>
			</tr>
			
			
			<tr>
				<td>Date :</td>
				<td><input type="text" name="date" /></td>
			</tr>
			
			
			<tr>
				<td>Submit :</td>
				<td><input type="submit" value="Submit" /></td>
			</tr>

		</table>





	</form>
	</div>

</body>
</html>