<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" isELIgnored="false" %>
<%@ taglib prefix="frm" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Edit Citizen</title>
   
</head>
<body>
    <h1 style="text-align: center">Edit Citizen</h1>

    <frm:form method="post" action="/ctzedit" modelAttribute="ctz">
        <p style="text-align: center">
           <label for="name">Citizen Name:</label>
            <frm:input path="name" type="text" placeholder="Citizen Name" value="${ctz.name}" />
            <br /><br />
            <label for="city">Citizen City:</label>
            <frm:input path="city" type="text" placeholder="Citizen city Name" value="${ctz.city}" />
            <br /><br />
            <label for="doses">No.of Doses Completed:</label>
           <frm:input path="doses" type="text" placeholder="No.of doses Completed" value="${ctz.doses}"/>
            <br /><br />
            <label for="vaccineStatus">Vaccine Status:</label>
           <frm:input path="status" type="text" placeholder="Vaccination Status"  value="${ctz.status}" />
            <br /><br />
            <input type="submit" value="Submit " />
        </p>
    </frm:form>
</body>
</html>
