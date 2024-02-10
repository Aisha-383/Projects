<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
    
    <%@ taglib prefix="frm" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Adding Center</title>
</head>
<body>
<h1 style="text-align: center">Adding Center</h1>

	<frm:form  method="post"  action="ctrinfo"  modelAttribute="ctr">
<p style="text-align: center">
        <label for="name">Center Name:</label>
		<frm:input path="name"  type="text" placeholder="Center Name" />
		<br /><br />
		 <label for="name">Center City Name:</label>
		<frm:input path="city"  type="text" placeholder="Center city Name" />
		<br /><br />
		
		<input type="submit"  value="Add New Vaccination Center" />
</p>
	</frm:form>
</body>
</html>