<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
       
        <h1>Edit player page</h1>
        <p>Here you can Edit a new player.</p>
        <p><c:out value="${message}" /></p>

        <form:form method="POST" commandName="player" action="${player.playerId}"  >

            <form:label path="age">Age</form:label>
            <form:input id="age" name="age" path="age" /><br>

            <form:label path="email">Email</form:label>
            <form:input id="email" name="email" path="email" /><br>
             
             <form:label path="firstName">First Name</form:label>
            <form:input id="firstName" name="firstName" path="firstName"/><br>
            
             <form:label path="lastName">Last Name</form:label>
            <form:input id="lastName" name="lastName" path="lastName" /><br>

            <form:label path="password">Password </form:label>
            <form:input id="password" name="password" path="password" /><br>

            <input type="submit" value="Save" /> 
           

        </form:form>
            
    </body>
</html>




