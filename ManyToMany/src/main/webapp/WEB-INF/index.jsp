<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Student Sign-up/Login</title>
</head>
<body>
     <h1>Add Student</h1>
    
    <form:form method="POST" action="/student/new" modelAttribute="student">
        <p>
            <form:label path="studentName">Student Name:</form:label>
            <form:input path="studentName"/>
        </p>
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
        <input type="submit" value="Student!"/>
    </form:form>
    
  	<form method="POST" action="/students/add">
  		<select name="student">
  			<c:forEach items="${exams}" var="exam">
  				<option value="${exam.id}"><c:out value="${exam.examName}"/></option>
  			</c:forEach>
  		</select>
  		
  		<select name="exam">
  			<c:forEach items="${students}" var="student">
  				<option value="${student.id}"><c:out value="${student.studentName}"/></option>
  			</c:forEach>
  		</select>
  		<input type="submit" value="Add!"/>
  	</form>
  	
    
    <h1>Add Exam</h1>
    
    <form:form method="POST" action="/exam/new" modelAttribute="exam">
        <p>
            <form:label path="examName">Exam Name:</form:label>
            <form:input path="examName"/>
        </p>
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
        <input type="submit" value="Exam!"/>
    </form:form>
    <br>
    <a href="/results">To Results</a>
</body>
</html>