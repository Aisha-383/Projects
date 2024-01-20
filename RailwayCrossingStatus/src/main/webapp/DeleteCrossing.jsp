<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.operations.AdminOperations"%>
<%@ page import="com.entity.RailwayCrossing"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Delete Crossing</title>

</head>
<body>

	<%

int crossingId = Integer.parseInt(request.getParameter("crossingId"));


AdminOperations adminOperations = new AdminOperations();
RailwayCrossing crossing = adminOperations.getRailwayCrossingById(crossingId);


%>
	<h2>Delete Crossing Confirmation</h2>
	<p>Are you sure you want to delete the following crossing?</p>


	<p>
		Name:
		<%= crossing.getName() %></p>
	<p>
		Address:
		<%= crossing.getAddress() %></p>
	<p>
		Landmark:
		<%= crossing.getLandmark() %></p>

	<form action="DeleteCrossingServlet" method="post">
		<input type="hidden" name="crossingId" value="<%= crossing.getId() %>" />
		<input type="submit" value="Yes, Delete Crossing" />
	</form>


	<a href="railwayCrossing.jsp">Cancel</a>

</body>
</html>
