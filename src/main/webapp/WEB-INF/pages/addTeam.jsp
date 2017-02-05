<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" 
              integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" 
              crossorigin="anonymous">

        <!-- Optional theme -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" 
              integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" 
              crossorigin="anonymous">

        <!-- Latest compiled and minified JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" 
                integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" 
        crossorigin="anonymous"></script>
    </head>
    <body>
        <h1>Add team page</h1>
        <div class="container">

        <p><c:out value="${message}" /></p>
        <form:form method="POST"  action="${pageContext.servletContext.contextPath}/team/add/process" modelAttribute="team" >
            <form:label path="teamName">Team Name</form:label>
            <form:input id="teamName" name="teamName" path="teamName" /><br>

            <form:label path="playerName">Player Name</form:label>
            <form:input id="playerName" name="playerName" path="playerName" /><br>

            <form:label path="teamManager">Team Manager</form:label>
            <form:input id="teamManager" name="teamManager" path="teamManager" /><br>

            <input type="submit" value="Add"  class="btn btn-success"/> 
            <input type="reset" value="reset" class="btn btn-danger">
            
            <br><br>
    <div style="color: red">${error}</div>


        </form:form>
    </div>
        <br/>
        <br/>
        Go back to <a href="<c:url value='/team/list'/>">List of All Teams</a>
        
        <br>
        <a href="<c:url value='/logout'/>">Log Out</a>

    </body>
</html>




