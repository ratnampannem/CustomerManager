<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hai Employee kkkkkkkkkkkkkkkkkk</title>
</head>
<body>
	<table>
		<c:forEach items="${empList}" var="employee">
		<tr>
			<td>$employee.empId</td>
			<td>$emloyee.empName</td>
			<td>$employee.email</td>
		</tr>
		</c:forEach>
		
	
	</table>

</body>
</html>