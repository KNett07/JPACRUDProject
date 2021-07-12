<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<title>Delete Confirmation</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">

</head>
<body>

<p>Are you sure you want to delete this winner?</p>

	<c:choose>
		<c:when test="${not empty winner }">

			<ul>

				<li><strong>ID: </strong>${winner.id }</li>
				<li><strong>Name: </strong>${winner.name }</li>
				<li><strong>Year Won: </strong>${winner.yearWon }</li>
				<li><strong>Time: </strong>${winner.time }</li>
				<li><strong>Color: </strong>${winner.color }</li>
				<li><strong>Trainer: </strong>${winner.trainer }</li>
				<li><strong>Jockey: </strong>${winner.jockey }</li>
				
			</ul>

		</c:when>

		<c:otherwise>
			<p>No Winner was found.</p>
		</c:otherwise>
		
	</c:choose>
	
	<form action="confirmDelete.do" method="POST">
		<input type="hidden" name="id" value="${winner.id }">
		<input type="submit" value="Confirm and Delete" />
	</form>
	
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4" crossorigin="anonymous"></script>


</body>
</html>