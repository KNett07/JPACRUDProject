<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<title>Kentucky Derby Winners</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">

</head>
<body>

	<h1>Welcome to the Kentucky Derby Winner's Circle</h1>

	<h2>View or add a winner, check out their personal page or just
		kick 'em out to pasture</h2>

	<p>
		<a href="ListAllWinners.do">List all Winners</a>
	</p>


	<form action="SearchById.do" method="POST">
		<input type="hidden" name="id" value="${dw.id }"> <input
			type="submit" value="Search By Id" />
	</form>

	<form action="SearchByName.do" method="POST">
		<input type="hidden" name="id" value="${dw.id }"> <input
			type="submit" value="Search By Name" />
	</form>

	<p>
		<a href="AddWinner.do">Add a Winner</a>
	</p>


	<p>
		<a href="UpdateWinner.do">Update a Winner</a>
	</p>
	<p>
		<a href="DeleteWinner.do">Delete a Winner</a>
	</p>



<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4" crossorigin="anonymous"></script>

</body>
</html>