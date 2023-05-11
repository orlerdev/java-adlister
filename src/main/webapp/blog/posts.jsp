<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<jsp:include page="/partials/head.jsp">
    <jsp:param   name="title" value="Create a Blog Post" />
</jsp:include>
<body>
<jsp:include page="/partials/navbar.jsp" />
<div class="container">
    <h1>Create a Blog Post</h1>
    <form action="posts" method="post">
        <label for="subject">Title:</label>
        <input type="text" name="title" id="subject">
        <label for="body">Your post:</label>
        <textarea name="body" id="body" cols="30" rows="10"></textarea>
        <input type="submit" value="Submit">
    </form>
    <c:forEach var="post" items="${posts}">
        <h2>${post.title}</h2>
        <h3>${post.user.username}</h3>
        <p>${post.body}</p>
    </c:forEach>
</div>

</body>
</html>
