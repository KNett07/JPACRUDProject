<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<title>Add a New Winner Here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">

</head>
<body>
	<p><a href="home.do">Home</a></p>

<form action="confirmCreate.do">
		<label for="name">Name: </label><input type="text" name="name" value="" id="name"><br>
		<label for="yearWon">Year Won: </label><input type="text" name="yearWon" value="" id="yearWon"><br>
		<label for="time">Time: </label><input type="text" name="time" value="" id="time"><br>
<label for="color">Choose a Color: </label>
			<select id="color" name="color">
    			<option value="Bay">Bay</option>
    			<option value="Dark Bay">Dark Bay</option>
    			<option value="Brown">Brown</option>
    			<option value="Black">Black</option>
    			<option value="Chestnut">Chestnut</option>
    			<option value="Grey">Grey</option>
    		</select><br>
		<label for="trainer">Trainer: </label><input type="text" name="trainer" value="" id="trainer"><br>
		<label for="jockey">Jockey: </label><input type="text" name="jockey" value="" id="jockey"><br>
		<input type="submit" value="Add Winner" />
</form>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4" crossorigin="anonymous"></script>


</body>
</html>