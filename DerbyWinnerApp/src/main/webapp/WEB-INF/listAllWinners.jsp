<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<title>Winner's Circle</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">

</head>
<body>

<h1>Click on a Name to be redirected to a Winner's Website</h1>

<p><a href="index.jsp">Home</a></p>
	
	<h2>Winners:</h2>
	
	<c:choose>
		<c:when test="${true }">
			<table>
				<thead><th><strong>ID</strong></th><th><strong>Name</strong></th></thead>
				<c:forEach items="${allWinners }" var="winner">
					<tr>
					<!--  href to winner's sites jsp?-->
					<td>${winner.id }</td>
					<td><a href="SearchById.do?id=${winner.id}">${winner.name}</a></td>
					</tr>
				</c:forEach>
			</table>
		</c:when>

		 <c:otherwise>
			<p>No winners in database.</p>
		</c:otherwise>
	</c:choose>
	
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4" crossorigin="anonymous"></script>


</body>
</html>