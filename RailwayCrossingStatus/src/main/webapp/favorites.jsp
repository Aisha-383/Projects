<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.List"%>
<%@ page import="com.entity.RailwayCrossing"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Favorite Crossings</title>
<!-- Add your CSS styles or include a separate CSS file if needed -->
</head>
<body>

	<h2 style="text-align: center;">Favorite Crossings</h2>
	<jsp:include page="userLinks.jsp" />

	<c:forEach var="favorite" items="${favorites}">
		<div class="favorite-crossing">
			<p>Name: ${favorite.name}</p>
			<p>Address: ${favorite.address}</p>
			<p>Landmark: ${favorite.landmark}</p>
			<p>Train Schedules: ${favorite.trainSchedules}</p>

		</div>
	</c:forEach>

	<!-- Add a link/button to go back to the list -->
	<a href="userrailwayCrossing.jsp">Back to List</a>

</body>
</html>
