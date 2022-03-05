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


<h1>Expense Details</h1>
<a href="/expenses"> go to main</a> 

<table class="table">
		<tr>
			<th>Expense Name:</th> 			<td>${item.name}</td>
		</tr>
		<tr>
			<th>Expense Description:</th> <td>${item.description}</td>
		</tr>
		<tr>
			<th>Vendor</th>			<td>${item.vendor}</td>
		</tr>
		<tr>
			<th>Amount</th>			<td>$${item.amount}</td>
		</tr>

</table>
	
</div>
</body>
</html>