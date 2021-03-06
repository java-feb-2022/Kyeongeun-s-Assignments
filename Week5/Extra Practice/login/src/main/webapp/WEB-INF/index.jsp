<%@ include file="/WEB-INF/tags/taglibs.jspf" %>
<layout:layout>
<div class="flex2 m-3 p-4">
  	<!-- User registration Form -->
  <h1>Register User</h1>
  
 
  <form:form method="POST" action="/registration" modelAttribute="newUser">
    <div class="form-group">
       <form:label path="firstName">First Name:</form:label>
       <form:errors class="text-danger" path="firstName"/>
       <form:input class="form-control" path="firstName"/>
   </div>
   	      <div class="form-group">
       <form:label path="lastName">Last Name:</form:label>
       <form:errors class="text-danger" path="lastName"/>
       <form:input class="form-control" path="lastName"/>
   </div>
   
   <div class="form-group">
       <form:label path="email">Email:</form:label>
       <form:errors class="text-danger" path="email"/>
       <form:input class="form-control" path="email"/>
   </div>
    <div class="form-group">
          <form:label path="password">Password:</form:label>
          <form:password class="form-control" path="password"/>
           <form:errors class="text-danger" path="password"/>
      </div>
       <div class="form-group">
          <form:label path="confirm">Password Confirmation:</form:label>
          <form:password class="form-control" path="confirm"/>
           <form:errors class="text-danger" path="confirm"/>
      </div>
       <br/>
      <button class="btn btn-primary">Register</button>
     
  </form:form>
  </div>
  <div class="flex2 m-3 p-4">
  <!-- User Login Form -->
  <h1>Login</h1>
	<form:form action="/login" modelAttribute="newLogin">
	<div class="form-row">
		<form:errors path="email" class="text-danger"/>
		<form:label for="email" path="email">Email:</form:label>
		<form:input type="text" path="email" class="form-control"/>
	</div>
	
	<div>
		<form:errors path="password" class="text-danger"/>
		<form:label for="password" path="password">Password:</form:label>
		<form:password path="password" class="form-control"/>
	</div>
	<br/>
		  <button class="btn btn-primary">Login</button>
</form:form>
</div>
</layout:layout>
