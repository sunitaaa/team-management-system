<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <h1>Add Player page</h1>
        <p>Here you can add a new Player.</p>

        <p><c:out value="${message}" /></p>
        <form:form method="POST"  action="${pageContext.servletContext.contextPath}/player/add/process" modelAttribute="player" >
            <form:label path="age">Age</form:label>
            <form:input id="age" name="age" path="age" /><br>

            <form:label path="email">Email</form:label>
            <form:input id="email" name="email" path="email" /><br>

            <form:label path="firstName">First Name</form:label>
            <form:input id="firstName" name="firstName" path="firstName" /><br>
            
            <form:label path="lastName">Last Name</form:label>
            <form:input id="lastName" name="lastName" path="lastName" /><br>
            
            <form:label path="password">Password</form:label>
            <form:input id="password" name="password" path="password" /><br>

            <input type="submit" value="Add" /> 
            <input type="reset" value="reset">

        </form:form>
        <br/>
        <br/>
        Go back to <a href="<c:url value='/player/list'/>">List of All Teams</a>
        
        <br>
        <a href="<c:url value='/logout'/>">Log Out</a>

    </body>
</html>




