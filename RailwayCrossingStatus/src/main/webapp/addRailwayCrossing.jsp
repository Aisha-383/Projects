<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Add Railway Crossing</title>
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

.form-group {
	margin-bottom: 15px;
}

label {
	display: block;
	margin-bottom: 5px;
}

input {
	width: 100%;
	padding: 10px;
	box-sizing: border-box;
}

button {
	background-color: green;
	color: #fff;
	padding: 10px;
	border: none;
	border-radius: 5px;
	cursor: pointer;
}
</style>
</head>
<body>
	<div class="container">
		<h1>Add Railway Crossing</h1>
		<form action="AddRailwayCrossingServlet" method="post">
			<div class="form-group">
				<label for="name">Name:</label> <input type="text" id="name"
					name="name" required>
			</div>
			<div class="form-group">
				<label for="address">Address:</label> <input type="text"
					id="address" name="address" required>
			</div>
			<div class="form-group">
				<label for="landmark">Landmark:</label> <input type="text"
					id="landmark" name="landmark" required>
			</div>
			<div class="form-group">
				<label for="schedules">Train Schedules:</label> <input type="text"
					id="schedules" name="schedules" required>
			</div>
			<div class="form-group">
				<label for="personInCharge">Person in Charge:</label> <input
					type="text" id="personInCharge" name="personInCharge" required>
			</div>
			<div class="form-group">
				<label for="status">Status:</label> <select id="status"
					name="status" required>
					<option value="Open">Open</option>
					<option value="Closed">Closed</option>
				</select>
			</div>
			<button type="submit">Add Crossing</button>
		</form>
	</div>
</body>
</html>
