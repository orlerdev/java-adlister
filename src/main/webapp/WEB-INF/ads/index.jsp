<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<jsp:include page="/WEB-INF/partials/head.jsp">
		<jsp:param name="title" value="Viewing All The dao.Ads" />
	</jsp:include>
</head>
<body>
<jsp:include page="/WEB-INF/partials/navbar.jsp" />

<div class="container">
	<jsp:include page="./search.jsp" />
	<c:forEach var="ad" items="${ads}">
		<div class="col-md-6">
			<h2>${ad.title}</h2>
			<p>${ad.description}</p>
		</div>
	</c:forEach>
</div>

</body>
</html>
