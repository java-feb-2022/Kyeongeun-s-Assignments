<%@ include file="/WEB-INF/tags/taglibs.jspf" %>
<layout:layout>
	<%@ include file ="/WEB-INF/tags/navbar.jspf" %>
	<p>Hello, <c:out value="${loggedInUser.firstName}"></c:out> ${loggedInUser.lastName}!  Welcome to..</p>
	<h1>The Book Broker!</h1>
	<p>Available Books to Borrow</p>
<table class="table">
	<thead>
		<tr>
			<th>ID</th>
			<th>Title</th>
			<th>Author Name</th>
			<th>Owner</th>
			<th>Action</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="freebook" items="${notBorrowedBooks}">
		<tr>
			<td>${freebook.id}</td>
			<td><a href="/books/${freebook.id}">${freebook.title}</a></td>
			<td>${freebook.author}</td>
			<td>${freebook.user.firstName} ${freebook.user.lastName}</td>
			<td>
				<c:choose>
					<c:when test="${loggedInUser.id == freebook.user.id}">
					<div class="d-flex">
						<a href="/books/edit/${freebook.id}" class="btn btn-warning">Edit</a>
						
						 <form:form action="/books/delete/${freebook.id}" method="delete">
						<button class="btn btn-danger">Delete</button>
						</form:form>
					</div>
					</c:when>
					<c:otherwise>
						<form:form action="/bookmarket/borrow/${freebook.id}" method="put" modelAttribute="borrowing">
							<form:hidden value="${freebook.title}" path="title"/> 
							<form:hidden value="${freebook.author}" path="author"/>
							<form:hidden value="${freebook.review}" path="review"/>
							<form:hidden value="${freebook.user.id}" path="user" />
							<button class="btn btn-success">Borrow</button>
						</form:form>
					</c:otherwise>
				</c:choose>
			</td>
		</tr>
		</c:forEach>
	</tbody>
</table>
<p>Books I'm Borrowing..</p>
<table class="table">
	<thead>
		<tr>
			<th>ID</th>
			<th>Title</th>
			<th>Author Name</th>
			<th>Owner</th>
			<th>Action</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="book" items="${borrowedBooks}">
		<tr>
			<td>${book.id}</td>
			<td><a href="/books/${book.id}">${book.title}</a></td>
			<td>${book.author}</td>
			<td>${book.user.firstName} ${book.user.lastName}</td>
			<td>
				<form:form action="/bookmarket/return/${book.id}" method="put" modelAttribute="returning">
					<form:hidden value="${book.title}" path="title"/> 
					<form:hidden value="${book.author}" path="author"/>
					<form:hidden value="${book.review}" path="review"/>
					<form:hidden value="${book.user.id}" path="user" />
					<button class="btn btn-primary">Return</button>
				</form:form>
			</td>
		</tr>
		</c:forEach>
	</tbody>
</table>


</layout:layout>
