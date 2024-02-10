
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<style>
    table {
        width: 100%;
        border-collapse: collapse;
        border: 1px solid black;
    }

    td {
        border: 1px solid black;
        padding: 8px;
        text-align: center;
    }
</style>
<table>
    <tr>
        <td><a href="<c:url value='/ctzall' />">Citizen</a></td>
        <td><a href="<c:url value='/ctrall' />">Vaccination Center</a></td>
        <td><a href="<c:url value='/login' />">Logout</a></td>
        <td><h3>Welcome, admin</h3></td>
    </tr>
</table>

