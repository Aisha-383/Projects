<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.operations.AdminOperations"%>
<%@ page import="com.entity.RailwayCrossing"%>
<%@ page import="com.entity.admin"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Modify Railway Crossing</title>
<style>
body {
	font-family: 'Arial', sans-serif;
	background-color: #f4f4f4;
	margin: 0;
	padding: 0;
}

.container {
	width: 50%;
	margin: 20px auto;
}

form {
	background-color: #fff;
	padding: 20px;
	border-radius: 10px;
	box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
}

label {
	display: block;
	margin-bottom: 8px;
}

input {
	width: 100%;
	padding: 8px;
	margin-bottom: 16px;
	box-sizing: border-box;
}

button {
	background-color: #007bff;
	color: #fff;
	border: none;
	padding: 8px 16px;
	text-align: center;
	text-decoration: none;
	display: inline-block;
	font-size: 14px;
	margin: 4px 2px;
	cursor: pointer;
}
</style>
</head>
<body>

	<div class="container">
		<h2>Modify Railway Crossing</h2>

		<%
    // Assuming you have a parameter named 'crossingId' in the URL
    String crossingIdParam = request.getParameter("crossingId");

    if (crossingIdParam != null) {
        int crossingId = Integer.parseInt(crossingIdParam);
        AdminOperations admOperations = new AdminOperations();
        RailwayCrossing crossing=admOperations.getRailwayCrossingById(crossingId);
       

        if (crossing != null) {
    %>

		<form action="UpdateCrossingServlet" method="post">
			<input type="hidden" name="crossingId"
				value="<%= crossing.getId() %>" /> 
			<label for="name">Name:</label>
			<input type="text" id="name" name="name" value="${crossing.name}"required /> 
			<label for="address">Address:</label> 
			<input type="text" id="address" name="address" value="<%= crossing.getAddress() %>" required /> 
			<label for="landmark">Landmark:</label>
			 <input type="text" id="landmark" name="landmark" value="<%= crossing.getLandmark() %>" required /> 
			 <label for="trainSchedules">Train Schedules:</label> 
			 <input type="text" id="trainSchedules" name="trainSchedules" value="<%= crossing.getTrainSchedules() %>" required /> 
			 <label for="personInCharge">Person in Charge:</label> 
			<input type="text" id="personInCharge" name="personInCharge" value="<%= crossing.getPersonInCharge() %>" required /> 
			<label for="status">Status:</label> <select id="status" name="status"required>

				<option value="open"
					<%= (crossing != null && crossing.getStatus() != null && crossing.getStatus().equals("open")) ? "selected" : "" %>>Open</option>
				<option value="closed"
					<%= (crossing != null && crossing.getStatus() != null && crossing.getStatus().equals("closed")) ? "selected" : "" %>>Closed</option>

			</select>

			<button type="submit">Update Crossing</button>
		</form>

		<%
        } else {
            out.println("Crossing not found.");
        }
    } else {
        out.println("Invalid request. Please provide a crossingId parameter.");
    }
    %>
	</div>

</body>
</html>
