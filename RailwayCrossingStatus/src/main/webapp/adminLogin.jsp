<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
body {
	font-family: 'Arial', sans-serif;
	background-color: #f4f4f4;
	margin: 0;
	display: flex;
	align-items: center;
	justify-content: center;
	height: 100vh;
}

.container {
	text-align: center;
	background-color: #fff;
	padding: 20px;
	border-radius: 10px;
	box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
	width: 300px;
}

form {
	margin-top: 20px;
	text-align: left;
}

label {
	display: block;
	margin-bottom: 8px;
}

input[type="text"], input[type="password"] {
	width: 100%;
	padding: 10px;
	margin-bottom: 8px;
	border: 1px solid #ccc;
	box-sizing: border-box;
	border-radius: 5px;
}

input[type="submit"] {
	background-color: green;
	color: #fff;
	padding: 10px;
	border: none;
	border-radius: 25px;
	cursor: pointer;
	width: 100%;
}

a {
	color: #007bff;
	text-decoration: none;
	margin-top: 10px;
	display: block;
}
</style>
</head>
<body>
	<div class="container">

		<h1>Railway Crossing</h1>
		<p>Admin Login</p>
		<form action="AdminLoginServlet" method="post">
    <label for="adminname">Admin Name:</label>
    <input type="text" id="adminname" name="adminname" required>

    <label for="password">Password:</label>
    <input type="password" id="password" name="password" required>

    <input type="submit" value="Login">
</form>
	</div>
</body>
</html>