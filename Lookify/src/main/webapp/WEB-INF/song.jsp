<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE HTML>
<html>
	<head>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css" integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb" crossorigin="anonymous">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js" integrity="sha384-alpBpkh1PFOepccYVYDB4do5UnbKysX5WZXm3XxPqe5iKTfUKjNkCk9SaVuEZflJ" crossorigin="anonymous"></script>
		<title>Details</title>
	</head>
	
	<body>	
		<div class="container">
		<br>
		<a href="/dashboard">Dashboard</a>
		<div class="text-center">
		<h3>Song Details</h3>
		<h5>Title<c:out value="${song.title}"/> </h5>
		<h5>Artist<c:out value="${song.artist}"/> </h5>
		<h5>Rating(1-10)<c:out value="${song.rating}"/> </h5>
		<h5><a href="/delete/${song.id}">Delete</a></h5>
		</div>
		</div>
	</body>
</html>