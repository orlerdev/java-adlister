<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<jsp:include page="/WEB-INF/partials/head.jsp">
		<jsp:param name="title" value="Register Your New Account" />
	</jsp:include>
</head>
<body>
<jsp:include page="/WEB-INF/partials/navbar.jsp" />
<div class="container">
	<h1>Register Your Account</h1>
	<form action="<c:url value="/register"/>" method="POST">
		<div class="form-group">
			<label for="username">Username</label>
			<input id="username" name="username" class="form-control" type="text" placeholder="Username...">
		</div>
		<div class="form-group">
			<label for="email">Email</label>
			<input id="email" name="email" class="form-control" type="email" placeholder="Email...">
		</div>

		<div class="form-group">
			<label for="password">Password</label>
			<input id="password" name="password" class="form-control" type="password" placeholder="Password...">
		</div>

		<div class="form-group">
			<label for="confirmPassword">Confirm Password</label>
			<input id="confirmPassword" name="confirmPassword" class="form-control" type="password"
						 placeholder="Confirm Password...">
		</div>
		<input type="submit" class="btn btn-primary btn-block" value="Register">
		<span style="display: block; margin-top: 20px;">Already have an account?<a href="<c:url value="/login"/>">Login</a> </span>
	</form>
</div>
</body>
</html>