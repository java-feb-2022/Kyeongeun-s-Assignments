<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Books</title>
	<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
	<link rel="stylesheet" type="text/css" href="/css/mystyle.css">
<!-- For any Bootstrap that uses JS or jQuery-->
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<body>
<a href="/books/new"> add new book</a> 
<table class="table">
	<thead>
		<tr>
			<th>ID</th>
			<th>Title</th>
			<th>Language</th>
			<th># of Pages</th>
			<th>Action</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="book" items="${books}">
		<tr>
			<td>${book.id}</td>
			<td><a href="/books/${book.id}">${book.title}</a></td>
			<td>${book.language}</td>
			<td>${book.numberOfPages}</td>
			<td><a href="/books/modify/${book.id}">modify</a>
			<form:form action="/books/delete/${book.id}" method="delete"><button class="btn btn-link">Delete</button></form:form>
			
			</td>
		</tr>
		</c:forEach>	
	</tbody>

</table>
</body>
</html>