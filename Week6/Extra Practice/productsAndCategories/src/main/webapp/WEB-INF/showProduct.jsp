

<%@ include file="/WEB-INF/tags/taglibs.jspf" %>
<layout:layout>
	<%@ include file="/WEB-INF/tags/navbar.jspf" %>
	<h1 class="text-primary m-3 p-4"><c:out value="${product.name}"/> </h1>

<div class="d-flex justify-content-between">
	<div class="flex2">
		<h3>Categories:</h3>
		<ul>
		<c:forEach var="cat" items="${product.categories}">
			<li><a href="/categories/${cat.id}">${cat.name}</a></li>
		</c:forEach>
		</ul>
	
	
	
	</div>

	<div class="flex2">
		<form action="/products/addCategory/${product.id}" method="post">
			
			<select name="category">
				<c:forEach var="cat" items="${newCategories}">
					<option value="${cat.id}" label="${cat.name}"/>
				</c:forEach>
			</select>
		</form>	
	</div>
	
</div>
</layout:layout>