<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CustomerManager</title>
</head>
<body>
<div align="center">
	<h1>Customer Manager</h1>
		<form method="get" action="search">
			<input type="text" name="keyword" />	
			<input type="submit" value="search" />
		</form>
		
		
		
		
		<table>
			<c:forEach items="${listCustomerTest123}" var="customer">
		<tr>
			<td> ${customer.id}</td>
			<td> ${customer.name} </td>
			<td> ${customer.email} </td>
			<td> ${customer.address} </td>
		</tr>
		
	</c:forEach>
	
	</table>
	</div>
</body>
</html>