<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
    
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
       
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="Nav.jsp" />
<h1 style="text-align: center">Center</h1>
<table width="100%" border="1">

 <td colspan="6" style="text-align: right;">
        <button><a href="<c:url value='nctr'/>">Add New Center</a></button>
    </td>

<tr>
<th>id</th>
<th>Name</th>
<th>City</th>
</tr>

<c:forEach var="s"  items="${ctrlist }">
	<tr>
	<td>${s.id }</td>
	<td>${s.name }</td>
	<td>${s.city }</td>
	<td>
        <button><a href="<c:url value='/ctredit/${s.id}'/>">Edit</a></button> |
        <button><a href="<c:url value='/ctrdelete/${s.id}' />">Delete</a></button> |
       <button><a href="<c:url value='/ctrview/${s.id}'/>">View</a></button> 
    </td>
	</tr>
</c:forEach>

<tr>
    <td colspan="6" style="text-align: center;">Total ${fn:length(ctrlist)} Centers Found</td>
</tr>
</table>

</body>
</html>