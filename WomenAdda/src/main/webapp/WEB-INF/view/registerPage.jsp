<%@include file="header.jsp"%>
<br><br>
<br>
<div class="container central">
				 <h2 class="add-user-heading">REGISTRATION PAGE</h2>
				<form:form action="register" commandName="user" modelAttribute="user">
			
		<div class="row">
			<div class=col-xs-4><form:label path="name"><spring:message text="Name"/></form:label></div>
			<div class=col-xs-8><form:input path="name"/></div>
			
		</div>
			<div class="row">
			<div class=col-xs-4><form:label path="password"><spring:message text="Password"/></form:label></div>
			<div class=col-xs-8><form:input path="password"/></div>
			
		</div>
			<div class="row">
			<div class=col-xs-4><form:label path="gender"><spring:message text="Gender"/></form:label></div>
			<div class=col-xs-8> 
			 <form:select path="gender">
				<form:option value="" label="--- Select ---" />
				<form:option value="Male">Male</form:option>
				<form:option value="Female">Female</form:option>
		  </form:select>
           </div>
          
		</div>
			<div class="row">
			<div class=col-xs-4><form:label path="email"><spring:message text="Email"/></form:label></div>
			<div class=col-xs-8><form:input path="email"/></div>
			
		</div>
		<div class="row">
			<div class=col-xs-4><form:label path="address"><spring:message text="Address"/></form:label></div>
			<div class=col-xs-8><form:input path="Address"/></div>
			
		</div>
	
		
		<br>
		
		<div class="row">
			<div class=col-xs-4></div>
		    <div class=col-xs-8><input type="submit" value="<spring:message text="ADD USER"/>"></div>
		  
		</div>
	
</form:form>
</div>
<div id="footer">
<%@include file="footer.jsp" %>
</div>


