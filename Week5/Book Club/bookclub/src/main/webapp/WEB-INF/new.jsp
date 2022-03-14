<%@ include file="/WEB-INF/tags/taglibs.jspf" %>
<layout:layout>
<%@ include file="/WEB-INF/tags/navbar.jspf" %>
<h1>Add a Book to Your Shelf!</h1>



<form:form action="/books/create" modelAttribute="book" class="d-flex flex-column">
	<%@ include file="/WEB-INF/tags/book_form.jspf" %>
</form:form>
</layout:layout>