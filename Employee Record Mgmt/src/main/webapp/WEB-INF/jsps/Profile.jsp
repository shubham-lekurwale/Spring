<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Profile</title>
<style type="text/css">
<%@include file ="/Style.css"%>
</style>
</head>
<body class = "profile">
	<h1>Welcome To Your Profile</h1>
	<hr>
	<table border = "1">
		<c:forEach items="${profile}" var="prof">
			
			<c:url var="updateEmp" value="UpdateEmp">
				<c:param name="EmpId" value="${prof.id}"></c:param>
			</c:url>
			<c:url var="deleteEmp" value="DeleteEmp">
				<c:param name="EmpId" value="${prof.id}"></c:param>
			</c:url>

			<tr>
				<td>Your Id :</td>
				<td>${prof.id}</td>
			</tr>
			<tr>
				<td>Your Name :</td>
				<td>${prof.name}</td>
			</tr>
			<tr>
				<td>Your Email :</td>
				<td>${prof.email}</td>
			</tr>
			<tr>
				<td>Your Gender :</td>
				<td>${prof.gender}</td>
			</tr>
			<tr>
				<td>Your Birth Date :</td>
				<td>${prof.dob}</td>
			</tr>
			<tr>
				<td>Your City :</td>
				<td>${prof.city}</td>
			</tr>
			<tr>
				<td>Your password is :</td>
				<td>${prof.password}</td>
			</tr>

		</c:forEach>

	</table>
	<hr>
	<input type="button" onclick="window.location.href='${deleteEmp}'" value="Delete Account" class = "btnd">
	<input type="button" onclick="if(!(confirm('Are you sure want to delete record ?'))) return false" onclick="window.location.href='${updateEmp}'"  value="Update Profile" class = "btnu">
</body>
</html>