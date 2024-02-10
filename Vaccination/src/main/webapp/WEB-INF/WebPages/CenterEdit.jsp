<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" isELIgnored="false" %>
<%@ taglib prefix="frm" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Edit Center</title>
   
</head>
<body>
    <h1 style="text-align: center">Edit Center</h1>

    <frm:form method="post" action="/ctredit" modelAttribute="ctz">
        <p style="text-align: center">
           <label for="name">Center Name:</label>
            <frm:input path="name" type="text" placeholder="Citizen Name" value="${ctz.name}" />
            <br /><br />
            <label for="city">Center City:</label>
            <frm:input path="city" type="text" placeholder="Citizen city Name" value="${ctz.city}" />
            <br /><br />
           
            <input type="submit" value="Submit " />
        </p>
    </frm:form>
</body>
</html>
