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
	<br>
		<div class="container">
		<a href="/">Create New Person</a> 
		<br>
		<a href="/license">Create New License</a> 
		<div class="text-center panel panel-default">
		<h3><c:out value="${person.first}"/> <c:out value="${person.last}"/></h3>
		<c:forEach items="${license}" var="license">
			<p>_____________________________________</p>
			<p>License Number: <c:out value="${license.number}"/></p>
			<p>State: <c:out value="${license.state}"/></p>
			<p>Expiration Date: <c:out value="${license.date}"/></p>
			<p>_____________________________________</p>
		</c:forEach>
		</div>
		</div>
	</body>
</html>