<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. --> 
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- Formatting (dates) --> 
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
    <title>Dojos and Ninjas</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/mystyle.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/jquery/jquery.min.js"></script>
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body class="d-flex justify-content-center fullwidth">
	<div class="d-flex flex-column align-items-center justify-content-center width80">
	
		<h1>New Ninja</h1>
		<div> <a href="/"> go to main </a> </div>
		<form:form action="/ninjas/create" modelAttribute="ninja">
			<form:label path="firstName">First Name:</form:label>
			<form:input path="firstName" /><br>
			
			<form:label path="lastName">Last Name:</form:label>
			<form:input path="lastName" /><br>

			<form:label path="age">Age:</form:label>
			<form:input path="age" /><br>

			<form:label path="dojo">Dojo:</form:label>
			<form:select path="dojo">
				<c:forEach var="a_dojo" items="${dojos}">
					<form:option value="${a_dojo.id}" label="${a_dojo.name}"/>
				</c:forEach>		
			</form:select><br>
			
			<button class="btn btn-success">Create</button>
		</form:form>

	</div>
</body>
</html>