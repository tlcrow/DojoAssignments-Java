<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>    

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Chose Subscription Package</title>
</head>
<body>
    <h1>Welcome to Results</h1>
    <h3>Here are the results</h3>
    <p>Students: <c:out value="${students.size()}"/></p>
    <c:forEach items="${students}" var="student">
    		<p><c:out value="${student.studentName}"/> <a href="delete/student/${student.id}">Delete</a>Id and Size Match</p>
    </c:forEach>
    <h3>Middle Table</h3>
    <c:forEach items="${students}" var="student">
    
    		<c:forEach items="${student.getExams()}" var ="exam">
    			<p><c:out value="${student.studentName}"/> <c:out value="${exam.getExamName()}"/> <a href="delete/combo/${student.id}/${exam.getId()}">Delete</a></p>
    		</c:forEach>
    		
    </c:forEach>
    
    <p>Exams: <c:out value="${exams.size()}"/></p>
    <c:forEach items="${exams}" var="exam">
    		<p><c:out value="${exam.examName}"/> <a href="delete/exam/${exam.id}">Delete</a></p>
    </c:forEach> 
    <a href="/">Back to Create</a>
</body>
</html>