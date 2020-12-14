<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>New Ninja</h1>
	<form:form action="/ninjas" method="post" modelAttribute="ninja">
		<p>
			<form:label path="firstName">First Name: </form:label>
			<form:errors path="firstName"/>
			<form:input path="firstName"/>
		</p>
		<p>
			<form:label path="lastName">Last Name: </form:label>
			<form:errors path="lastName"/>
			<form:input path="lastName"/>
		</p>
		<p>
			<form:label path="age">Age: </form:label>
			<form:input path="age"/>
		</p>
		<p>
			<form:label path="dojo">Dojo: </form:label>
			<form:errors path="dojo"/>
			<form:select path="dojo">
				<form:options items="${dojo}" itemValue="id" itemLabel="name" />
			</form:select>
		</p>
			<input type="submit" value="Submit"/>
	</form:form>
</body>
</html>