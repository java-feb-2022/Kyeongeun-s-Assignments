<%@ include file="/WEB-INF/tags/taglibs.jspf" %>
<layout:layout>
	<%@ include file="/WEB-INF/tags/navbar.jspf" %>
	<h1 class="text-primary m-3 p-4"><c:out value="${category.name}"/> </h1>

<div class="d-flex justify-content-between">
	<div class="flex2">
		<h3>Products:</h3>
		<ul>
		<c:forEach var="product" items="${category.products}">
			<li><a href="/products/${product.id}">${product.name}</a></li>
		</c:forEach>
		</ul>
	</div>
	<div class="flex2">
		Add Product:

		<form action="/categories/addProduct/${category.id}" method="post" >
		<select name="product">
			<c:forEach var="product" items="${newProducts}">
				<option value="${product.id}" label="${product.name}"/>
			</c:forEach>
		</select>
			<button class="btn btn-primary">Submit</button>
		</form>
		
		
	</div>

	<div>
	</div>
</div>
</layout:layout>

