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
    <title>Show Dormitory</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/mystyle.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/jquery/jquery.min.js"></script>
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body class="d-flex justify-content-center fullwidth">
<div class="d-flex flex-column width80">

	<nav class="d-flex fullwidth justify-content-between">

	<div>
		<a href="/">mains</a> | <a href="/dorms/new">add new dormitory</a>
	</div>
	</nav>
	<h1>${dorm.name} Dormitory</h1>

	<form action="/dorms/${dorm.id}/add">
		<label>Students:</label>
		<select name="student">
			<c:forEach var="s" items="${students}">
				<option value="${s.id}">${s.firstName} ${s.lastName}</option>
			</c:forEach>
		</select>
		<button class="btn btn-primary">Add</button>
	</form>
	
	<table class="table">
		<thead>
			<tr>
				<th>Name</th>
				<th>actions</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="dorm_student" items="${dorm.students}">
				<tr>
					<td>${dorm_student.firstName} ${dorm_student.lastName}</td>
					<td>
						<form action="/dorms/${dorm_student.id}/remove">
							<input type="hidden" name="student" value="${dorm_student.id }">
							<button class="btn btn-link">Remove</button>
						</form>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>
</body>
</html>