<%@ include file="/WEB-INF/tags/taglibs.jspf" %>
<layout:layout>

		<%@ include file="/WEB-INF/tags/navbar.jspf" %>
	<h1>Products and Categories</h1>
	<table>
	<c:forEach var="cat" items="${categories}">
		<tr>
			<td><a href="/categories/${cat.id}">${cat.name}</a> | 
			
			<form:form action="/categories/delete/${cat.id}" method="delete">
			<button>DELETE</button>
			</form:form>
			
			</td>	
			
		
		</tr>
	</c:forEach>
	</table>
</layout:layout>
