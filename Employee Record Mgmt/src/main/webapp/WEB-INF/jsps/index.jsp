<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<title>Feedback System</title>
<style type="text/css">
<%@include file ="/Style.css"%>
</style>
<link rel="stylesheet" href="resources/sweetalert.css">
</head>
<body class="index">
	<h1>~ Welcome to feedback system ~</h1>
	
	<hr>
	
		<table border="4" align = "center">
			<tr>
				<th>---------</th>

			</tr>
			<tr>
				<td><a href="Registration">Add Feedback</a></td>
			</tr>
			<!-- <tr>
				<td><a href="Login">Login</a></td>
			</tr> -->
			<tr>
				<td><a href="Records">All Feedback Records</a></td>
			</tr>
			<!-- <tr>
				<td><a href="About.jsp">About</a></td>
			</tr> -->
		</table>
	<hr>
	<script src="resources/sweetalert.min.js"></script>
	<!-- <script type="text/javascript">
	window.onload = Onload;
	function Onload() {
		var errorMsg = "<c:out value="${message}" />";
		console.log(errorMsg)
		if (errorMsg != "") {
			sweetAlert(errorMsg);
		}
	}
	</script> -->
</body>
</html>
