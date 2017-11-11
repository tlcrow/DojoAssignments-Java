<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE HTML>
<html>
	<head>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css" integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb" crossorigin="anonymous">
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js" integrity="sha384-alpBpkh1PFOepccYVYDB4do5UnbKysX5WZXm3XxPqe5iKTfUKjNkCk9SaVuEZflJ" crossorigin="anonymous"></script>
		<title>New Person</title>
	</head>
	
	<body>
		<div class="container">
		<br>
		<h2>New Person</h2>
		<br>
        <form:form action='/newperson' method= 'post' modelAttribute= "person" class="form-horizontal">
        		<div class="group-form">
        		<form:label path="first">First Name
    				<form:errors path="first"/>
    				<form:input path="first"/>
    			</form:label> 
    			</div>
    			<br>
    			<div class="group-form">
            <form:label path="last">Last Name
    				<form:errors path="last"/>
    				<form:input path="last"/>
    			</form:label> 
    			</div>
    			<br>
    			<div class="group-form">
            <input type="submit" value="Submit" class="btn-sm"/>
            </div>
        </form:form>
        </div>
	</body>
</html>