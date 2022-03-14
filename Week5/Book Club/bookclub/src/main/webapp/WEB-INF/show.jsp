<%@ include file="/WEB-INF/tags/taglibs.jspf" %>
<layout:layout>
<%@ include file="/WEB-INF/tags/navbar.jspf" %>

<div class="d-flex flex-column">
    <h1>${book.title}</h1>
    <p><span class="reader">${book.user.firstName}</span>
        read 
        <span class="booktitle">${book.title}</span>
        by
        <span class="bookauthor">${book.author}</span>
    </p>
    <p>Here are <span class="reader">${book.user.firstName}</span>'s thoughts:</p>
    <hr>
    <p>${book.review}</p>
    <hr>
</div>
<c:if test="${loggedInUser.id == book.user.id}">
    <a href="/books/edit/${book.id}" class="btn btn-success">Edit</a>
</c:if>
</layout:layout>