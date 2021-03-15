<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style type="text/css">
<%@include file ="/Style.css"%>
</style>
<title>Login</title>
</head>
<body class = "login">
	<h1>Login Account</h1>
	<hr>
	<form action="loginEmp">
		<table>
			<tr>
				<td>Enter Name :</td>
				<td><input type="text" name="name" class = "txt"></td>
			</tr>
			<tr>
				<td>Enter Password :</td>
				<td><input type="password" name="password" class = "txt"></td>
			</tr>
			<tr >
				<td></td>
				<td><input type="button" onclick="window.location.href='Registration'" value="Register" class = "btns">
				<input type="submit" value="Login" class = "btnl">
				<input type="reset" value="Reset" class = "btnr">
				</td>
			</t>
		</table>
	</form>
	<hr>
</body>
</html>