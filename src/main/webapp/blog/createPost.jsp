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
<h1 class="container">Create a Blog Post</h1>
<form class="container" action="createPost" method="POST">
	<label for="title">Title:</label>
	<input type="text" name="title" id="title" />
	<label for="post">Your Post:</label>
	<textarea name="post" id="post" cols="30" rows="10"></textarea>
	<input type="submit">
</form>

<c:if test="${post != null}">
	<h2>Your blog post:</h2>
	<h3>${post.title}</h3>
	<p>${post.post}</p>
</c:if>

</body>
</html>