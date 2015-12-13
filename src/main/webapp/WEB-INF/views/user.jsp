<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%@ page pageEncoding="UTF-8"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<html>
<head>
<title>User Page</title>
</head>
<body>
	<h1>Welcome to Spring MVC ! Member Number is ${user.id}.</h1>

	<P>Hello ${user.name} , the time on the server is ${serverTime}.</P>

	<h3>This is all users in the system !!!</h3>
	<hr>
	<c:forEach var="us" items="${users}">
		<h4>&nbsp;<c:out value="${us.id}"/>&nbsp;<c:out value="${us.name}"/><br></h4>
	</c:forEach>
</body>
</html>
