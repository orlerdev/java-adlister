<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<title>Quotes</title>
</head>
<body>
<c:forEach var="quote" items="${quotes}">
	<div class="quote">
		<p>${quote.author.name} said: ${quote.content}</p>
	</div>
</c:forEach>
</body>
</html>
