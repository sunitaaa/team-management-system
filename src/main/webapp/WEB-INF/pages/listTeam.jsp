<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    </head>
    <body>
        
        <h1>List of teams</h1>
        <p><c:out value="${message}" /></p>


        <table border="1px" cellpadding="0" cellspacing="0" >
            <thead>
                <tr>
                    <th width="10%">id</th><th width="15%">teamName</th><th width="10%">playerName</th><th width="15%">teamManager</th><th width="10%">actions</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="team" items="${teams}">
                    <tr>
                        <td>${team.teamId}</td>
                        <td>${team.teamName}</td>
                        <td>${team.playerName}</td>
                        <td>${team.teamManager}</td>
                        <td>
                            <a href="${pageContext.servletContext.contextPath}/team/edit/${team.teamId}">Edit</a><br/>
                            <a href="${pageContext.servletContext.contextPath}/team/delete/${team.teamId}">Delete</a><br/>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
        <br>
        <a href="<c:url value='/team/add'/>">Add New Team</a>

    </body>
</html>
