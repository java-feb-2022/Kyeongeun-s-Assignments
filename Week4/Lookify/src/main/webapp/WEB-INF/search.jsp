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

	<nav class="d-flex fullwidth justify-content-between">
	<div>
		Songs by artist:${artist}
	</div>
	<form action="/search" method="post">
		<input type="text" name="artist" value="${artist}"/>
		<button>New Search</button>
	</form>
	<a href="/dashboard">Dashboard</a>
	</nav>
	<table class="table">
		<thead>
			<tr>
				<th>Name</th>
				<th>rating</th>
				<th>actions</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="song" items="${songs}">
				<tr>
					<td>${song.title}</td>
					<td>${song.rating}</td>
					<td>
						<form:form action="/songs/delete/${song.id}" method="delete">
							<button class="btn btn-link">Delete</button>
						</form:form>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>
</body>
</html>
