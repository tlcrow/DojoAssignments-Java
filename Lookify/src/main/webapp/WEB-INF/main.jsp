<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE HTML>
<html>
	<head>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css" integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb" crossorigin="anonymous">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js" integrity="sha384-alpBpkh1PFOepccYVYDB4do5UnbKysX5WZXm3XxPqe5iKTfUKjNkCk9SaVuEZflJ" crossorigin="anonymous"></script>
		<title>Lookify!</title>
	</head>
	
	<body>
		<br>
		<div class="container">
		<p><a href="/songs/new">Add New</a>    |     <a href="/songs/top">Top Songs</a></p>
		<form action='/search' method= 'post'>
            <p><input type='text' name='artist'>   <input type='submit' value='Search Artists'></p>
        </form>
		<table class="table table-stripted">
			<tr>
				<th>Name</th>
				<th>Rating</th>
				<th>Action</th>
			</tr>
			<c:forEach items= "${songs}" var="song" varStatus="loop">
				<tr>
					<td><a href="/songs/${song.id}"> <c:out value="${song.title}"/> </a></td>
					<td><c:out value="${song.rating}"/></td>
					<td><a href="/delete/${song.id}">Delete</a></td>
				</tr>
			</c:forEach>
		</table>	
		</div>
	</body>
</html>