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
	<h1>All Ninja's</h1>
	<ul>
		<c:forEach items="${ninjas}" var="ninja">
			<li>First name: ${ninja.firstName}</li>
			<li>Last name: ${ninja.lastName}</li>
			<li>Age: ${ninja.age}</li>
			<li>Dojo Location: ${ninja.firstName}</li>
		</c:forEach>
	</ul>
</body>
</html>