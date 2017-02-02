<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <h1>Add team page</h1>
        <p>Here you can add a new team.</p>

        <p><c:out value="${message}" /></p>
        <form:form method="POST"  action="${pageContext.servletContext.contextPath}/team/add/process" modelAttribute="team" >
            <form:label path="teamName">Team Name</form:label>
            <form:input id="teamName" name="teamName" path="teamName" /><br>

            <form:label path="playerName">Player Name</form:label>
            <form:input id="playerName" name="playerName" path="playerName" /><br>

            <form:label path="teamManager">Team Manager</form:label>
            <form:input id="teamManager" name="teamManager" path="teamManager" /><br>

            <input type="submit" value="Add" /> 
            <input type="reset" value="reset">

        </form:form>
        <br/>
        <br/>
        Go back to <a href="<c:url value='/team/list'/>">List of All Teams</a>
        
        <br>
        <a href="<c:url value='/logout'/>">Log Out</a>

    </body>
</html>




