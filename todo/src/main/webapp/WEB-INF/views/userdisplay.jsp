<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<!-- 		use c: forEach and c:out for displaying the list of users here
			import Core jstl Tag library here						 -->
	<div align="center">
		<h1 align="center">User Management System</h1>
		<table border="1" bordercolor="black" cellpadding="5px" bgcolor="lightblue">
			<caption>
				<h1>List of Users</h1>
			</caption>
			<tr>
				<th>Name</th>
				<th>Email</th>
				<th>Age</th>
				<th>Country</th>

			</tr>

			<c:forEach var="user" items="${userList }">
				<tr>
					<td><c:out value="${user.name }"></c:out></td>
					<td><c:out value="${user.email }"></c:out></td>
					<td><c:out value="${user.age }"></c:out></td>
					<td><c:out value="${user.country }"></c:out></td>

				</tr>
			</c:forEach>
		</table>

	</div>




</body>
</html>