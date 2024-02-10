<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Center Information</title>
</head>
<body>
    <jsp:include page="Nav.jsp" />
    <h1 style="text-align: center">Center Information</h1>

    <h2>Citizens List</h2>
    <table>
        <tr>
            <th>Citizen ID</th>
            <th>Citizen Name</th>
            <th>Action</th>
        </tr>
        <c:forEach var="citizen" items="${citizensList}">
            <tr>
                <td>${citizen.id}</td>
                <td>${citizen.name}</td>
                <td><a href="/Vacc/ctrall">View</a></td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
