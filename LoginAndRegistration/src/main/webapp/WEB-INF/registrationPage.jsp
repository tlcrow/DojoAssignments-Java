<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css" integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb" crossorigin="anonymous">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js" integrity="sha384-alpBpkh1PFOepccYVYDB4do5UnbKysX5WZXm3XxPqe5iKTfUKjNkCk9SaVuEZflJ" crossorigin="anonymous"></script>
<title>Registration Page</title>
</head>
<body>
	<div class="container">
	<br>
     <c:if test="${logoutMessage != null}">
        <font color="green"><c:out value="${logoutMessage}"></c:out></font>
    </c:if>

    <h1>Login</h1>
    <c:if test="${errorMessage != null}">
        <font color="red"><c:out value="${errorMessage}"></c:out></font>
    </c:if>
    
    <form method="POST" action="/login">
        <p>
            <label for="username">Email</label>
            <input type="text" id="username" name="username"/>
        </p>
        <p>
            <label for="password">Password</label>
            <input type="password" id="password" name="password"/>
        </p>
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
        <input type="submit" value="Login!" class="btn-sm">
    </form>
    <br>
    <h1>Register!</h1>
    
    <font color="red"><p><form:errors path="user.*"/></p></font>
    
    <form:form method="POST" action="/registration" modelAttribute="user">
        <p>
            <form:label path="username">Email:</form:label>
            <form:input path="username"/>
        </p>
        <p>
            <form:label path="first">First Name:</form:label>
            <form:input path="first"/>
        </p>
        <p>
            <form:label path="last">Last Name:</form:label>
            <form:input path="last"/>
        </p>
        <p>
            <form:label path="password">Password:</form:label>
            <form:password path="password"/>
        </p>
        <p>
            <form:label path="passwordConfirmation">Password Confirmation:</form:label>
            <form:password path="passwordConfirmation"/>
        </p>
        <input type="submit" value="Register!" class="btn-sm">
    </form:form>
    </div>
</body>
</html>