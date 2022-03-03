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

<h1>New Book</h1>

<a href="/books"> go to main</a>

<form:form action="/process/create" modelAttribute="book" method="post">
	
	<form:label path="title">Title</form:label>
	<form:errors class="text-danger" path="title"/><br>
	<form:input path="title"/>
<p>
	<form:label path="description">Description</form:label>
	<form:errors class="text-danger" path="description"/><br>
	<form:input path="description"/>
<p>
	<form:label path="language">Language</form:label>
	<form:errors class="text-danger" path="language"/><br>
	<form:input path="language"/>
<p>
	<form:label path="numberOfPages"># of Pages</form:label>
	<form:errors class="text-danger" path="numberOfPages"/><br>
	<form:input path="numberOfPages" />
<p>
<button>Submit</button>
</form:form>
</body>
</html>