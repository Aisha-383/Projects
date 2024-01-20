<!-- displayCrossing.jsp -->
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<title>Display Crossing</title>
</head>
<body>
	<h2>Crossing Details</h2>
	<c:if test="${not empty foundCrossing}">
		<p>Name: ${foundCrossing.name}</p>
		<p>Location: ${foundCrossing.location}</p>
	</c:if>

	<c:if test="${not empty searchError}">
		<p>${searchError}</p>
	</c:if>
</body>
</html>
