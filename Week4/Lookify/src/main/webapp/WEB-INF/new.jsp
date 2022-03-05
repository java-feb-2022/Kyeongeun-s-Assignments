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
		<a href="/dashboard">Dashboard</a>
	</nav>

	<form:form action="/songs/create" method="post" modelAttribute="song">
	<table>
		<tr>
			<td>
				<form:label path="title"> Title </form:label>
				<form:errors path="title" />			
			</td>
			<td>
				<form:input path="title" />
			</td>
		</tr>
		<tr>
			<td>
				<form:label path="artist"> Artist </form:label>
				<form:errors path="artist" />			
			</td>
			<td>
				<form:input path="artist" />
			</td>
		</tr>
		
		<tr>
			<td>
				<form:label path="rating"> rating </form:label>
				<form:errors path="rating" />			
			</td>
			<td>
				<form:input type="number" path="rating"/>
			</td>
		</tr>
	</table>
		<button>Add Song</button>
	</form:form>
</div>
</body>
</html>