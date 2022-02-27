<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Omikuji Form</title>
	<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
	<link rel="stylesheet" type="text/css" href="/css/mystyle.css">
<!-- For any Bootstrap that uses JS or jQuery-->
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
	
	
	

</head>
<body class="d-flex justify-content-center align-items-center fullwidth" style="height:500px;">
	<div class="d-flex justify-content-center width80">
		<div class="bg-dark text-light m-3 p-3 flex-column">
            <h1 class='text-warning m-3'>Here's Your Omikuji!</h1>
			<p>In ${number} years, you will live in ${city} with ${person} as your roommate, ${hobby} for a living.</p>
			<p>The next time you see a ${thing}, you will have good luck.</p>
			<p>Also, ${comment}</p>
			<a href="/">Go back</a>
        </div>
	</div>
</body>
</html>