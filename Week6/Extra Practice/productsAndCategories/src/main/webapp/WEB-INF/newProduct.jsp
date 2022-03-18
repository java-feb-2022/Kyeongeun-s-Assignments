<%@ include file="/WEB-INF/tags/taglibs.jspf" %>
<layout:layout>
	<%@ include file="/WEB-INF/tags/navbar.jspf" %>
	<h1 class="text-primary m-3 p-4">New Product</h1>
	<form:form action="/products/create" modelAttribute="product" class="d-flex flex-column">
		<form:label path="name">Name:</form:label>
		<form:errors path="name" class="text-danger" />
		<form:input path="name"/>


		<form:label path="description">Description:</form:label>
		<form:errors path="description" class="text-danger" />
		<form:textarea rows="7" path="description"/>
		
		
		<form:label path="price">price:</form:label>
		<form:errors path="price" class="text-danger" />
		<form:input path="price"/>
		<br>
		<button class="btn btn-primary">Submit</button>
	</form:form>

</layout:layout>
