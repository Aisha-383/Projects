<!-- search.jsp -->
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<html>
<head>
<title>Railway Crossing Search</title>
</head>
<body>
	<form action="SearchCrossingServlet" method="post">
		<label for="crossingName">Search Railway Crossing</label> <input
			type="text" id="crossingName" name="crossingName"> <input
			type="submit" name="search" value="Search">
	</form>
</body>
</html>
