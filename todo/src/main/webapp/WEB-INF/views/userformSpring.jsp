<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<h1 align="center">User Registration Form</h1>
		<f:form action="usermodel" method="post" modelAttribute="user">
			<table>
				<tr>
					<td>Username :</td>
					<td><f:input path="name"/></td>
				</tr>
				<tr>
					<td>Email :</td>
					<td><f:input path="email"/></td>
				</tr>
				<tr>
					<td>Age :</td>
					<td><f:input path="age"/></td>
				</tr>
				<tr>
					<td>Country :</td>
					<td><f:input path="country"/></td>
				</tr>
				<tr>
				
					<td><input type="submit" value="Submit" /></td>
				</tr>

			</table>
		</f:form>
	</div>
</body>
</html>