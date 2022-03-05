<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Read Share</title>
	<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
	<link rel="stylesheet" type="text/css" href="/css/mystyle.css">
<!-- For any Bootstrap that uses JS or jQuery-->
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<body class="d-flex justify-content-center fullwidth">
<div class="d-flex flex-column width80">


<h1>Save Travels</h1>

<table class="table">
	<thead>
		<tr>
			<th>Expense</th>
			<th>Vendor</th>
			<th>Amount</th>
			<th>Action</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="item" items="${items}">
		<tr>
			<td>${item.name}</td>
			<td>${item.vendor}</td>
			<td>$${item.amount}</td>
			<td><a href="/travel/edit/${item.id}" class="btn btn-link">Edit</a>
			<form:form action="/travel/delete/${item.id}" method="delete"><button class="btn btn-link">Delete</button></form:form>
			</td>
		</tr>
		</c:forEach>	
	</tbody>
</table>
<h1>Add an expense:</h1>
<form:form action="/process/create" method="post" class="d-flex flex-column" modelAttribute="expense">
	<form:errors class="text-danger" path="name"/>
	<form:errors path="vendor" class="text-danger"/>
	<form:errors path="amount" class="text-danger" />
	<form:errors path="description" class="text-danger"/>
	

	<form:label path="name">Expense Name:</form:label>
	<form:input path="name" />


	<form:label path="vendor">Vendor:</form:label>
	<form:input path="vendor" />


	<form:label path="amount">Amount:</form:label>
	<form:input path="amount" />

	<form:label path="description">Description:</form:label>
	<form:textarea path="description" rows="5" cols="30"/>
	<input type="submit">
</form:form>	
	
</div>
</body>
</html>