
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css" integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb" crossorigin="anonymous">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js" integrity="sha384-alpBpkh1PFOepccYVYDB4do5UnbKysX5WZXm3XxPqe5iKTfUKjNkCk9SaVuEZflJ" crossorigin="anonymous"></script>
<title>Survey Results</title>
</head>
<body>
	<br>
	<div class="container text-center">
		<h3>Information Submitted</h3>
		<p><strong>Name:</strong> <c:out value="${name}"/></p>
		<p><strong>Dojo Location:</strong> <c:out value="${location}"/></p>
		<p><strong>Favorite Language:</strong> <c:out value="${language}"/></p>
		<p><strong>Comments:</strong> <c:out value="${comments}"/></p>
		<a href="/" class="btn-sm">Go Back</a>
	</div>
</body>
</html>
