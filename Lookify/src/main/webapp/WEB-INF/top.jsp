<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE HTML>
<html>
	<head>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css" integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb" crossorigin="anonymous">
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js" integrity="sha384-alpBpkh1PFOepccYVYDB4do5UnbKysX5WZXm3XxPqe5iKTfUKjNkCk9SaVuEZflJ" crossorigin="anonymous"></script>
		<title>Top Songs</title>
	</head>
	
	<body>	
		<br>
		<div class="container">
		<a href="/dashboard">Dashboard</a>
		<u><h2>Top Ten Songs:</h2></u>
		<c:forEach items= "${songs}" var="song" varStatus="loop">
			<p>*<c:out value="${song.rating}"/> | <c:out value="${song.title}"/> | <c:out value="${song.artist}"/> </p>
		</c:forEach>
		</div>
	</body>
</html>