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
        
        <h1>List of players</h1>
        <p><c:out value="${message}" /></p>
        <div class="container">


            <table class="table table-striped" border="1px" cellpadding="0" cellspacing="0" >
            <thead>
                <tr>
                    <th width=>id</th><th width=>Age</th><th width=>Email</th><th width=>First Name</th><th>Last Name</th><th>Password</th><th >actions</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="player" items="${players}">
                    <tr>
                        <td>${player.playerId}</td>
                        <td>${player.age}</td>
                        <td>${player.email}</td>
                        <td>${player.firstName}</td>
                        <td>${player.lastName}</td>
                        <td>${player.password}</td>
                        <td>
                            <a href="${pageContext.servletContext.contextPath}/player/edit/${player.playerId}">Edit</a><br/>
                            <a href="${pageContext.servletContext.contextPath}/player/delete/${player.playerId}">Delete</a><br/>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
            </div>
        <br>
        <a href="<c:url value='/player/add'/>">Add New player</a>

    </body>
</html>
