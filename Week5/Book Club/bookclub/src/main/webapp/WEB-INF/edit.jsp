<%@ include file="/WEB-INF/tags/taglibs.jspf" %>
<layout:layout>
<%@ include file="/WEB-INF/tags/navbar.jspf" %>
<h1>Change Your Entry!</h1>

<form:form action="/books/update/${book.id}" modelAttribute="book" class="d-flex flex-column" method="put">
	<%@ include file="/WEB-INF/tags/book_form.jspf" %>
</form:form>
</layout:layout>