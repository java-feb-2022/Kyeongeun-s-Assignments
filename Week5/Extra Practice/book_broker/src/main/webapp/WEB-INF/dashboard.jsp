<%@ include file="/WEB-INF/tags/taglibs.jspf" %>
<layout:layout>
<%@ include file="/WEB-INF/tags/navbar.jspf" %>
<div>
<h1>Welcome, ${loggedInUser.firstName} ${loggedInUser.lastName}! </h1>

<div class="d-flex justify-content-between">
  <p> Books from everyone's shelves:</p>
  <a href="/books/new">Add a book to my shelf!</a>
</div>

<table class="table striped">
  <thead>
    <tr>
      <th>ID</th>
      <th>Title</th>
      <th>Author Name</th>
      <th>Posted By</th>
    </tr>
  </thead>
  <tbody>
    <c:forEach var="thought" items="${books}">
    	<tr>
        <td>${thought.id}</td>
    	  <td><a href="/books/${thought.id}">${thought.title}</a></td>
        <td>${thought.author}</td>
        <td>${thought.user.firstName} ${thought.user.lastName}</td>
    	</tr>
    </c:forEach>
  </tbody>
</table>


</div>

</layout:layout>