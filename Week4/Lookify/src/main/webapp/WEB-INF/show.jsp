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
    <title>Lookify</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/mystyle.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/jquery/jquery.min.js"></script>
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body class="d-flex justify-content-center fullwidth">
<div class="d-flex flex-column width80">

	<nav class="d-flex fullwidth justify-content-end">
		<a href="/dashboard">Dashboard</a>
	</nav>


	<table class="fullwidth table">
		<thead>
			<tr>
				<th></th>
				<th></th>
			</tr>
		</thead>
		<tbody>

		<tr>
			<td> Title
			</td>
			<td>
				${song.title}
			</td>
		</tr>
		<tr>
			<td>
				 Artist		
			</td>
			<td>
				${song.artist}</td>
		</tr>
		
		<tr>
			<td>
			Rating(1-10)			
			</td>
			<td>
				${song.rating}
			</td>
		</tr>
		</tbody>
	</table>
	<form:form action="/songs/delete/${song.id}" method="delete">
		<button class="btn btn-link">Delete</button>
	</form:form>
</div>
</body>
</html>