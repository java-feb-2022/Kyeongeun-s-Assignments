<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Customer Name: <c:out value="${name}"></c:out></h2>
<p>Item name: <c:out value="${itemName}"></c:out></p>
<p>Price: <c:out value="${price}"></c:out> </p>
<p>Description: <c:out value="${description}"></c:out></p>
<p>Vendor: <c:out value="${vendor}"></c:out></p>
</body>
</html>