<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Winner</title>
<meta name="viewport" content="width=device-width, initial-scale=1">

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">

</head>
<body>
<p><a href="index.jsp">Home</a></p>
	
		<h5>Enter the Winner's NEW details and then click "Update Winner" to update it in the database: </h5>
				
				
				<form class="" action="ConfirmUpdate.do" method="POST">
				</form>
			<input name = "id" type = "hidden" value=${winner.id } id = "id">
			<label for="name">Name: </label><input type="text" name="name" value="${winner.name }" id="name"><br>
		
<!-- year won -->
			<label for="yearWon">Year Won: </label><input type="text" name="yearWon" value="${winner.yearWon }" id="yearWon"><br>


<!-- time -->
			<label for="time">Time: </label><input type="text" name="time" value="${winner.time }" id="time"><br>


<li><strong>Color: </strong>
				
					<c:choose>
						<c:when test="${winner.color }">Bay</c:when>
						<c:when test="${winner.color}">Dark Bay</c:when>
						<c:when test="${winner.color }">Brown</c:when>
						<c:when test="${winner.color }">Black</c:when>
						<c:when test="${winner.color}">Chestnut</c:when>
						<c:when test="${winner.color }">Grey</c:when>
						
						<c:otherwise>No Color Found</c:otherwise>
						
					</c:choose>
				
				</li>

<!-- Trainer -->
			<label for="trainer">Trainer: </label><input type="text" name="trainer" value="${winner.trainer }" id="trainer"><br>


<!-- Jockey -->
			<label for="jockey">Jockey: </label><input type="text" name="jockey" value="${winner.jockey }" id="jockey"><br>


		<input type="submit" value="Confirm and Update" />


<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4" crossorigin="anonymous"></script>


</body>
</html>