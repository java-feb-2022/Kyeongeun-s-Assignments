<%@ include file="/WEB-INF/tags/taglibs.jspf" %>
<layout:layout>
	<%@ include file="/WEB-INF/tags/navbar.jspf" %>
	<h1 class="text-primary m-3 p-4">New Category</h1>

	<form:form action="/categories/create" modelAttribute="category">
		<form:label path="name">Name:</form:label>
		<form:errors path="name" class="text-danger" />
		<form:input path="name"/>
		<button class="btn btn-primary">Submit</button>
	</form:form>
</layout:layout>
