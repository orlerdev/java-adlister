<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<jsp:include page="/partials/head.jsp">
		<jsp:param name="title" value="Create a Blog Post" />
	</jsp:include>
</head>
<body>
<jsp:include page="/partials/navbar.jsp" />
<div class="container">
	<h1>Create A Blog Post</h1>
	<form class="container" action="createPost" method="POST">
		<label for="title">Title:</label>
		<input type="text" name="title" id="title" />
		<label for="body">Your Post:</label>
		<textarea name="body" id="body" cols="30" rows="10"></textarea>
		<input type="submit">
	</form>
	<c:forEach var="post" items="${posts}">
		<h2>${post.title}</h2>
		<h3>${post.user.username}</h3>
		<p>${post.body}</p>
	</c:forEach>
</div>

</body>
</html>