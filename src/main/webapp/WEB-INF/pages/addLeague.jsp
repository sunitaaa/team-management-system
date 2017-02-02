<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <h1>Add League page</h1>
        <p>Here you can add a new League.</p>
        <p><c:out value="${message}" /></p>

        <form:form method="POST"  action="${pageContext.servletContext.contextPath}/league/add/process" modelAttribute="league">

            <form:label path="countryName">Country Name</form:label>
            <form:input id="countryName" name="countryName" path="countryName" /><br>

            <form:label path="leagueManager">League Manager</form:label>
            <form:input id="leagueManager" name="leagueManager" path="leagueManager" /><br>

            <form:label path="leagueName">League Name</form:label>
            <form:input id="leagueName" name="leagueName" path="leagueName" /><br>

            <input type="submit" value="Add" /> 
            <input type="reset" value="reset">

        </form:form>
            <br/>
            <br/>
            Go back to <a href="<c:url value='/league/list'/>">List of All Leagues</a>
            <br><br>
            
            <a href="<c:url value='/logout'/>">Log Out</a>
            
    </body>
</html>




