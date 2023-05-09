<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%! int count = 0; %>
<% count += 1; %>
<html>
<head>
	<jsp:include page="partials/head.jsp">
		<jsp:param name="title" value="Home" />
	</jsp:include>
</head>
<body>
<%--THESE "PARTIALS" ARE BASICALLY COMPONENTS--%>
<%--THEY CAN EVEN ACCEPT PARAMS--%>
<jsp:include page="partials/navbar.jsp" />
<%-- This is a JSP comment, you will not see this in the html --%>
<!-- this is an HTML comment, you WILL see this in the HTML -->
<h2>Implicit Objects in action:</h2>
<p>Path: <%= request.getRequestURL() %>
</p>
<p>Query String: <%=request.getQueryString()%>
</p>
<p>"Name" parameter: <%=request.getParameter("Name")%>
</p>
<p>Method attribute: <%=request.getMethod()%>
</p>
<h1>The current count is <%= count %>
</h1>
<h2>EL / Expressions Language</h2>
<p>"Name" parameter: ${param["name"]}</p>
<%--Implicit object will return the result of a math function, even though the numbers are technically strings--%>
<%--Will also perform regular math functions--%>
<%--Will not CONCAT strings--%>
<p>${5 + 3}</p>
<p>${"5" + "3"}</p>

<% request.setAttribute("numbers", new int[]{222, 777, 21, 7, 14, 3}); %>

<%--For Each syntax--%>
<%--items= the array to iterate--%>
<%--var= each element of the array--%>
<ul>
	<c:forEach items="${numbers}" var="number">
		<li>${number}</li>
	</c:forEach>
</ul>

<% request.setAttribute("five", 5); %>
<c:choose>
	<c:when test="${true}">
		<h1>Expression 1 is true</h1>
	</c:when>
	<c:when test="${false}">
		<h1>Expression 2 is false</h1>
	</c:when>
	<c:otherwise>
		<p>Both expressions are false</p>
	</c:otherwise>
</c:choose>

</body>
</html>