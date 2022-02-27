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
<body class="d-flex justify-content-center align-items-center fullwidth" style="height:800px;">
	<div class="d-flex justify-content-center width80">
		<div class="bg-dark text-light m-3 p-3 flex-column">
            <h1 class='text-warning m-3'>Send an Omikuji!</h1>
            <form action="/process" method="post">
            
                <div class="m-3">
                    <label for='number'>Pick any number from 5 to 25 </label><br>
                    <input type="number" min="5" max="25" name="number">
                </div>            
            
            
                <div class="m-3">
                    <label for="city">Enter the name of any city.</label>
                    <input type='text' name='city' class="form-control">
                </div>
                
                <div class="m-3">
                    <label for="person">Enter the name of real person.</label>
                    <input type='text' name='person' class="form-control">
                </div>
               
                <div class="m-3">
                    <label for="hobby">Enter professional endeavor or hobby</label>
                    <input type='text' name='hobby' class="form-control">
                </div>
                
                <div class="m-3">
                    <label for="thing">Enter any type of living thing.</label>
                    <input type='text' name='thing' class="form-control">
                </div>

                <div class="m-3">
                    <label class="mb-2" for="comments">Say something nice to someone:</label><br>
                    <textarea id='comments' name="comment" class="form-control" rows="7"></textarea>
                </div>
                <div class="m-3"> Send and show a friend</div>
                <div class="m-3 d-flex justify-content-end">
                    <input class='btn btn-light' type='submit' name='submit' value='Send'>
                </div>
            </form>
        </div>
	</div>
</body>
</html>