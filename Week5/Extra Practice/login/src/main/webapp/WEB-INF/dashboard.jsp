<%@ include file="/WEB-INF/tags/taglibs.jspf" %>
<layout:layout>
<div>
<h1>Welcome, ${loggedInUser.firstName} ${loggedInUser.lastName}! </h1>

<p> This is your dashboard. nothing to see here yet</p>

<a href="/logout">logout</a>
</div>

</layout:layout>