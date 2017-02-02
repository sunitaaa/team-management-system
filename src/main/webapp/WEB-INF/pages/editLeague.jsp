<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
       
        <h1>Edit team page</h1>
        <p>Here you can Edit a new team.</p>
        <p><c:out value="${message}" /></p>

        <form:form method="POST" commandName="league" action="${league.leagueId}"  >

            <form:label path="countryName">Country Name</form:label>
            <form:input id="countryName" name="countryName" path="countryName" /><br>

            <form:label path="leagueManager">League Manager</form:label>
            <form:input id="leagueManager" name="leagueManager" path="leagueManager" /><br>

            <form:label path="leagueName">Player Name</form:label>
            <form:input id="leagueName" name="leagueName" path="leagueName" /><br>

            <input type="submit" value="Save" /> 
           

        </form:form>
            
    </body>
</html>




