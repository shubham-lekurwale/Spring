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
<%@include file = "/Style.css"%>
.error{
	color: black;
	font-family: 'Times New Roman', Times, serif;
	font-style: italic;
	font-size: 0.7em;
}
</style>
<title>Feedback</title>
</head>
<body class="Registration">
	<h1>Feedback</h1>
	<br><br>
	<hr/>
	<f:form modelAttribute="employee" action="saveEmployee" method="post">
	<td><f:hidden path="id" /></td>
		<table border = "1">
			<tr>
				<td>Enter Name :</td>
				<td><f:input path="name" class = "txt"/>
				<f:errors path="name" cssClass="error"></f:errors></td>
			</tr>
			<tr>
				<td>Enter Email :</td>
				<td><f:input path="email" class = "txt"/>
				<f:errors path="email" cssClass="error"></f:errors></td>
			</tr>
				<tr>
				<td>Enter  Feedback :</td>
				<td><f:textarea path="gender" class = "txtArea"/>
				<f:errors path="gender" cssClass="error"></f:errors></td>
			</tr>
			
		<%-- 	<tr>
				<td>Select Gender :</td>
				<td><f:radiobutton path="gender" value="Male" class = "rdo"/>Male 
				<f:radiobutton path="gender" value="Female" class = "rdo"/>Female
				<f:errors path="gender" cssClass="error"></f:errors></td>
			</tr>
			 --%>
			
			
			<%-- <tr>
				<td>Enter Date of Birth :</td>
				<td><f:input path="dob" type = "date" class = "txt"/>
				<f:errors path="dob" cssClass="error"></f:errors></td>
			</tr>
			<tr>
				<td>Select City :</td>
				<td><f:select path="city" class = "txt">
						<f:option value="Pune">Pune</f:option>
						<f:option value="Mumbai">Mumbai</f:option>
						<f:option value="Nashik">Nashik</f:option>
						<f:option value="Sangli">Sangli</f:option>
						<f:option value="Akola">Akola</f:option>
						<f:option value="Ahmednagar">Ahmednagar</f:option>
					</f:select>
					<f:errors path="city" cssClass="error"></f:errors></td>
			</tr>
			<tr>
				<td>Enter Password :</td>
				<td><input type = "password" name = "pass" class = "txt"></td>
			</tr>
			<tr>
				<td>Re-Enter Password :</td>
				<td><f:password path="password" class = "txt"/>
				<f:errors path="password" cssClass="error"></f:errors></td>
			</tr> --%>
			<tr>
				<td></td>
				<td><input type="submit" value = "Save Feedback" class = "btns"/>
				<input type="Button" onclick="window.location.href='Home'" value ="Home" class = "btnl"/>
				<input type="reset" value = "Reset" class = "btnr"/></td>
			</tr>
		</table>
	</f:form>
	<br><br>
	<hr/>
</body>
</html>