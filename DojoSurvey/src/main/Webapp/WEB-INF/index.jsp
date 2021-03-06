<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css" integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb" crossorigin="anonymous">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js" integrity="sha384-alpBpkh1PFOepccYVYDB4do5UnbKysX5WZXm3XxPqe5iKTfUKjNkCk9SaVuEZflJ" crossorigin="anonymous"></script>
<title>Dojo Survey</title>
</head>
<body>
	<br>
	<div class="container">
	<h3>Dojo Survey</h3>
	<br>
	<form action='/results' method= 'post'>
            <label>Your Name: <input type='text' name='name'></label>
            <br>
            <br>
            <label>Dojo Location: <select name='location'></label>
                <option value='select'>select</option>
                <option value='Washington, DC'>Washington, DC</option>
                <option value='Seattle'>Seattle</option>
                <option value='Bay Area'>Bay Area</option>
            </select>
            <br>
            <br>
            <label>Favorite Language: <select name='language'></label>
                <option value='select'>select</option>
                <option value='Python'>Python</option>
                <option value='Ruby'>Ruby</option>
                <option value='Java'>Java</option> 
            </select>
         	<br>
         	<br>
         	<p>Comments:</p>
            <textarea name='comments'></textarea>
            <br>
            <br>
            <input type='submit' value='Submit' class="btn-sm">
        </form>
        </div>
</body>
</html>