<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<link rel="stylesheet" href="./assets/login.css">
	<jsp:include page="partials/head.jsp">
		<jsp:param name="title" value="Login" />
	</jsp:include>
</head>
<body>
<jsp:include page="partials/navbar.jsp" />
<form action="<c:url value="/login.jsp"/>" method="POST">
	<label for="username">Username:</label>
	<input type="text" name="username" id="username" />
	<label for="password">Password:</label>
	<input type="password" name="password" id="password" />
	<button type="submit">Submit</button>
</form>
</body>
</html>
<c:choose>
	<c:when test="${param['username'] == 'admin' && param['password'] == 'password'}">
		<c:redirect url="profile.jsp" />
	</c:when>
</c:choose>
