<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Kentucky Derby Winners</title>
</head>
<body>

	<h1>Welcome to the Kentucky Derby Winner's Circle</h1>
	
	<h2>View or add a winner, check out their personal page or just kick 'em out to pasture</h2>
	
		<p><a href="ListAllWinners.do">List all Winners</a></p>
	
	
	<form action="SearchById.do" method="POST">
		<input type="hidden" name="id" value="${dw.id }">
		<input type="submit" value="Search By Id" />
	</form>
	
	<form action="SearchByName.do" method="POST">
		<input type="hidden" name="id" value="${dw.id }">
		<input type="submit" value="Search By Name" />
	</form>
	
	<form action="AddWinner.do" method="POST">
		<input type="hidden" name="id" value="${dw.id }">
		<input type="submit" value="Add A Winner" />
	</form>
	
	<form action="DeleteWinner.do" method="POST">
		<input type="hidden" name="id" value="${dw.id }">
		<input type="submit" value="Delete A Winner" />
	</form>
	<form action="UpdateWinner.do" method="POST">
		<input type="hidden" name="id" value="${dw.id }">
		<input type="submit" value="Update A Winner" />
	</form>
	








</body>
</html>