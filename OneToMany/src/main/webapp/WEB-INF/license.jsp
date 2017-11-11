<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE HTML>
<html>
	<head>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css" integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb" crossorigin="anonymous">
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js" integrity="sha384-alpBpkh1PFOepccYVYDB4do5UnbKysX5WZXm3XxPqe5iKTfUKjNkCk9SaVuEZflJ" crossorigin="anonymous"></script>
		<title>New License</title>
	</head>
	
	<body>
	<br>
		<div class="container">
		<h2>New License</h2>
		<form:form action='/newlicense' method= 'post' modelAttribute="license" class="form-horizontal">
		<div class="group-form">
		Name
		<form:select path="person" modelAttribute="person">
			<c:forEach items="${person}" var="person">
				<form:option value="${person.id}" name="person">${person.first} ${person.last}
				</form:option>
			</c:forEach>
		</form:select>
		</div>
		<br>
		<div class="group-form">
    				<form:label path="state">State
    				<form:errors path="state"/>
    				<form:input path="state"/>
    			</form:label>
    		</div>
    		<br>
    		<div class="group-form">
    			<form:label path="date">Expiration Date
    				<form:errors path="date"/>
    				<form:input path="date" type="date"/>
    			</form:label>
    		</div>
    		<br>
    		<div class="group-form">
            <input type='submit' value='Create' class="btn-sm">
        </div>
        </form:form>
        </div>
	</body>
</html>