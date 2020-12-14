<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>All Dojo's</h1>
	<ul>
		<c:forEach items="${dojos}" var="dojo">
			<li>${dojo.name}</li>
		</c:forEach>
	</ul>
</body>
</html>