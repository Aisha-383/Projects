<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Railway Crossing Search Results</title>
    <!-- Add your CSS styles here if needed -->
</head>
<body>

<h2>Search Results</h2>

<div class="container">
<c:if test="${not empty searchResults}">
    <c:forEach var="crossing" items="${searchResults}">
        <div class="container">
            <h3>${crossing.name}</h3>
            <p>Address: ${crossing.address}</p>
				<p>Landmark: ${crossing.landmark}</p>
				<p>Train Schedules: ${crossing.trainSchedules}</p>
				<p>Person in Charge: ${crossing.personInCharge}</p>
				<p>
					Status: <span
						style="background-color: ${crossing.status == 'open' ? 'green' : 'red'};">
						${crossing.status} </span>
				</p>
        </div>
    </c:forEach>
    </c:if>
    </div>


<c:if test="${empty searchResults}">
    <p>No results found.</p>
</c:if>
   


</body>
</html>
