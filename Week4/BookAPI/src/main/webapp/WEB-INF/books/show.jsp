<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
<h1>${book.title}</h1>

<a href="/books"> go to main</a>
<table class="table">

		<tr>
			<th>Description:</th><td>${book.description}</td>
		</tr><tr>
			<th>Language:</th><td>${book.language}</td>
				</tr><tr>
			<th># of pages</th><td>${book.numberOfPages}</td>
		</tr>
	</tbody>

</table>
</body>
</html>