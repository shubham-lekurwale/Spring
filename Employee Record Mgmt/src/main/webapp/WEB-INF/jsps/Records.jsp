<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Feedback Records</title>
<style type="text/css">
<%@include file ="/Style.css"%>
</style>
</head>
<body class = "records">
	<h1>All Feedback Records</h1>

	<hr>
	<table border = "3">
		<tr>
			<th>Id </th>
			<th>Name</th>
			<th>Email </th>
			<th>Feedback</th>
			<th>Delete</th>
			<!-- <th>DOB</th>
			<th>City</th> -->
		</tr>
		
		<c:forEach items="${empList}" var="empList">
		
		<c:url var="deleteEmp" value="DeleteEmp">
				<c:param name="EmpId" value="${empList.id}"></c:param>
		</c:url>
		<tr>
			<td>${empList.id}</td>
			<td>${empList.name}</td>
			<td>${empList.email}</td>
			<td class = "feed">${empList.gender}</td>
			<td>
				<input type="button" onclick="window.location.href='${deleteEmp}'" value="Delete Feedback" class = "btnd">
			</td>
		</tr>
		</c:forEach>
	</table>

</body>
</html>