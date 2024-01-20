<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.List"%>
<%@ page import="com.operations.AdminOperations"%>
<%@ page import="com.entity.RailwayCrossing"%>
<%@ page import="com.entity.admin"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Railway Crossing Status - Admin Home</title>
<style>
body {
	font-family: 'Arial', sans-serif;
	background-color: #f4f4f4;
	margin: 0;
	padding: 0;
}

.container {
	width: 80%;
	margin: 20px auto;
}

.railway-crossing {
	background-color: #fff;
	padding: 20px;
	margin: 10px 0;
	border-radius: 10px;
	box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
}

.logout {
	float: right;
}

h1, jsp {
	text-align: center;
}

.search-bar {
	display: inline-block;
	text-align: center;
	align-items: center;
}

span {
	color: white;
	border-radius: 10px;
}
table {
       
      width: 100%;
           border-collapse: collapse;
            margin-top: 20px;
        }

        th, td {
            border: 1px solid #ddd;
            padding: 8px;
            text-align: left;
        }

        th {
            background-color: #f2f2f2;
        }

        .modify-delete-buttons {
            display: flex;
            justify-content: space-between;
        }

        .modify-delete-buttons button {
            margin-right: 5px;
        }
</style>
</head>
<body>

	<h1>Railway Crossing Status - Admin Home</h1>
	 <div class="search-bar">
		<jsp:include page="search.jsp" />
	</div>
	<jsp:include page="AdminLinks.jsp" />
   
	<%
	AdminOperations admOper=new AdminOperations();
	List<RailwayCrossing> crossList=admOper.ShowAll();
	pageContext.setAttribute("crossList",crossList);	    
%>

	<div class="container">
<table>
            <thead>
                <tr>
                    <th>Name</th>
                    <th>Address</th>
                    <th>Landmark</th>
                    <th>Train Schedules</th>
                    <th>Person in Charge</th>
                    <th>Status</th>
                    <th>Actions</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="crossing" items="${crossList}">
                    <tr>
                        <td>${crossing.name}</td>
                        <td>${crossing.address}</td>
                        <td>${crossing.landmark}</td>
                        <td>${crossing.trainSchedules}</td>
                        <td>${crossing.personInCharge}</td>
                        <td style="color: ${crossing.status == 'open' ? 'green' : 'red'};">${crossing.status}</td>
                        <td class="modify-delete-buttons">
                            <!-- Button to modify crossing -->
                            <form action="ModifyCrossingForm.jsp" method="post">
                                <input type="hidden" name="crossingId" value="${crossing.id}" />
                                <button type="submit">Modify</button>
                            </form>

                            <!-- Button to delete crossing -->
                            <form action="DeleteCrossing.jsp" method="post">
                                <input type="hidden" name="crossingId" value="${crossing.id}" />
                                <button type="submit">Delete</button>
                            </form>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>

		</table>
	</div>
</body>
</html>
