<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
     
    </head>
    <body>
        <form:form id="registrationForm" method="POST" action="${pageContext.servletContext.contextPath}/addAdmin/process" modelAttribute="registrationRequestDTO">
            
           <form:label path="email">Email:</form:label>
            <form:input id="email" name="email" path="email" /><br>
            
            <form:label path="firstName">First Name:</form:label>
            <form:input id="firstName" name="firstName" path="firstName" /><br>
            
            <form:label path="lastName">Last Name</form:label>
            <form:input id="lastName" name="lastName" path="lastName" /><br>
            
            <form:label path="password">Password:</form:label>

            <form:password id="password" name="password" path="password" /><br>
            
            <form:label path="roles">Roles</form:label>
          <select id="roles" name="roles">
              <option>----SELECT---------</option>
             <option value="A">A</option>
             <option value="S">S</option>
             </select>
          <br><br>

            <input type="submit" value="Register" />
            
            <br>
            <a href="<c:url value='/logout'/>">Log Out</a>
         
        </form:form>
    </body>
</html>
