<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    </head>
    <body>
        
        <h1>List of players</h1>
        <p><c:out value="${message}" /></p>


        <table border="1px" cellpadding="0" cellspacing="0" >
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
        <br>
        <a href="<c:url value='/player/add'/>">Add New player</a>

    </body>
</html>
