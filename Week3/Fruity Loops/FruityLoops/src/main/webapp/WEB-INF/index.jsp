<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Fruity Loops</title>
	<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
	<link rel="stylesheet" type="text/css" href="/css/mystyle.css">
<!-- For any Bootstrap that uses JS or jQuery-->
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body class="d-flex justify-content-center align-items-center fullwidth" style="height:500px;">
	<div class="d-flex flex-column justify-content-between width80">
		<h1> Fruit Store</h1>
		<table class="table mytable">
			<tr>
				<th>Name</th>
				<th>Price</th>
			</tr>
			<c:forEach var="fruit" items="${fruitList}">
				<tr>
					<td><c:out value="${fruit.getName()}"></c:out></td>
					<td><c:out value="${fruit.getPrice()}"></c:out></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>