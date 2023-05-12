<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<jsp:include page="partials/head.jsp">
		<jsp:param name="title" value="Your Profile" />
	</jsp:include>
</head>
<body>
<jsp:include page="partials/logged-in-navbar.jsp" />

<div class="container">
	<h1>Welcome: ${username}</h1>
	<jsp:include page="partials/logout.jsp" />
</div>

</body>
</html>
