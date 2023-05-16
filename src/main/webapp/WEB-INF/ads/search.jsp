<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title>Search Ads</title>
	<link href="../css/reset.css">
	<link href="../css/layout.css">
</head>
<body>
<div class="page-wrapper">
	<div class="container">
		<div class="row">
			<div class="column">
				<c:if test="${empty search}">
					<h1>Here are all the ads!</h1>
				</c:if>
				<c:if test="${not empty search}">
					<h1>You are searching for <c:out value="${search}" /></h1>
				</c:if>
				<form action="${pageContext.request.contextPath}/ads/search" method="post">
					<label for="search"></label>
					<input id="search" type="text" name="search" placeholder="Search">
					<button type="submit">Search</button>
				</form>
			</div>
		</div>
	</div>
</div>
</body>
</html>
