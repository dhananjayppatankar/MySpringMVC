<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="#E2E2E2">

	<!-- 		use c: forEach and c:out for displaying the list of users here
			import Core jstl Tag library here						 -->
	
	<a href="employeeform">Back</a>
	
	<div align="center">
	
	
		<h1 align="center">Employee Management System</h1>
		<table border="1" bordercolor="black" cellpadding="5px" bgcolor="lightblue">
			<caption>
				<h1>List of Employees</h1>
			</caption>
			<tr>
				<th>Name</th>
				<th>Address</th>
				<th>Salary</th>
				<th>Date</th>

			</tr>

			<c:forEach var="employee" items="${employeeList }">
				<tr>
					<td><c:out value="${employee.ename }"></c:out></td>
					<td><c:out value="${employee.address }"></c:out></td>
					<td><c:out value="${employee.salary}"></c:out></td>
					<td><c:out value="${employee.date}"></c:out></td>

				</tr>
			</c:forEach>
		</table>
	
	</div>




</body>
</html>