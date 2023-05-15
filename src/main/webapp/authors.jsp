<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<title>List of Authors</title>
</head>
<body>
<c:forEach var="author" items="${authors}">
	<div>
		<p>${author.name}</p>
	</div>
</c:forEach>
</body>
</html>