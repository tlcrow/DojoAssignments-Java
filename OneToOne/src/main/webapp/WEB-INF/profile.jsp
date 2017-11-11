<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE HTML>
<html>
	<head>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css" integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb" crossorigin="anonymous">
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js" integrity="sha384-alpBpkh1PFOepccYVYDB4do5UnbKysX5WZXm3XxPqe5iKTfUKjNkCk9SaVuEZflJ" crossorigin="anonymous"></script>
		<title>Profile Page</title>
	</head>
	
	<body>
		<div class="container">
		<br>
		<a href="/">Create New Person</a>
		<div class="text-center">
		<h4><c:out value="${license.person.first}"/> <c:out value="${license.person.last}"/></h4>
		<p><strong>License Number: </strong><c:out value="${license.number}"/></p>
		<p><strong>State:</strong> <c:out value="${license.state}"/></p>
		<p><strong>Expiration Date: </strong><c:out value="${license.date}"/></p>
		</div>
		</div>
	</body>
</html>