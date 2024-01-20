<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.operations.AdminOperations" %>
<%@ page import="com.entity.RailwayCrossing" %>
<%@ page import="java.util.List" %>
<%@ page import="com.entity.admin"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Railway Crossing Status - Admin Home</title>
<style>
body {
	font-family: 'Arial', sans-serif;
	background-color: #f4f4f4;
	margin: 0;
	padding: 0;
}

.container {
	width: 80%;
	margin: 20px auto;
}

.railway-crossing {
	background-color: #fff;
	padding: 20px;
	margin: 10px 0;
	border-radius: 10px;
	box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
}

.logout {
	float: right;
}

h1, jsp {
	text-align: center;
}

.search-bar {
	display: inline-block;
	text-align: center;
	align-items: center;
}

span {
	color: white;
	border-radius: 10px;
}
.container {
	width: 80%;
	margin: 20px auto;
}
</style>
</head>
<body>

	<h1>Railway Crossing Status - user Home</h1>
	<div class="search-bar">
		<jsp:include page="search.jsp" />
	</div>
	<jsp:include page="userLinks.jsp" />

<%
    AdminOperations adminOperations = new AdminOperations();
    List<RailwayCrossing> crossList = adminOperations.ShowAll();
    pageContext.setAttribute("crossList", crossList);
%>
	
	<div class="container">
		<c:forEach var="crossing" items="${crossList}">
			<div class="railway-crossing">
				<h3><p>Name:${crossing.name}</p></h3>
				<p>Address: ${crossing.address}</p>
				<p>Landmark: ${crossing.landmark}</p>
				<p>Train Schedules: ${crossing.trainSchedules}</p>
				<p>Person in Charge: ${crossing.personInCharge}</p>
				<p>
					Status: <span
						style="background-color: ${crossing.status == 'open' ? 'green' : 'red'}";>
						${crossing.status} </span>
				</p>

            <form action="AddToFavoritesServlet" method="post">
            <input type="hidden" name="crossingId" value="${crossing.id}" />
            <input type="submit" value="Add to Favorites" />
                 </form>

			</div>
		</c:forEach>
	</div>
</body>
</html>
