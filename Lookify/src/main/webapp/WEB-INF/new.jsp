<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css" integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb" crossorigin="anonymous">
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js" integrity="sha384-alpBpkh1PFOepccYVYDB4do5UnbKysX5WZXm3XxPqe5iKTfUKjNkCk9SaVuEZflJ" crossorigin="anonymous"></script>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Add Song</title>
</head>
<body>
	<br>
	<div class="container">
	<c:forEach items="${errs}" var="err">
		<h2><c:out value="${err.getDefaultMessage()}"/></h2>
	</c:forEach>
	<a href="/dashboard">Dashboard</a>
	<br>
	<div class="group-form">
		<h3>Add Song</h3>
	</div>
	<form action='/new' method= 'post' class="form-horizontal">
		<div class="group-form">
            <label>Title <input type='text' name='title'></label>
        </div>
            <br>
     	<div class="group-form">
            <label>Artist <input type='text' name='artist'></label>
        </div>
            <br>
        <div class="group-form">
            Rating(1-10) <select name='rating'>
                <option value=1>1</option>
                <option value=2>2</option>
                <option value=3>3</option>
                <option value=4>4</option>
                <option value=5>5</option>
                <option value=6>6</option>
                <option value=7>7</option>
                <option value=8>8</option>
                <option value=9>9</option>
                <option value=10>10</option>
            </select>
        </div>
        <br>
        <div class="group-form">
            <input type='submit' value='Add Song' class="btn-sm">
        </div>
        </form>
        </div>
</body>
</html>