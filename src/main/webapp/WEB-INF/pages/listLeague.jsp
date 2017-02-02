<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      
    </head>
    <body>
        <h1>List Of League</h1>
         <p><c:out value="${message}" /></p>
        <table border="1px" cellpadding="0" cellspacing="0">
            <thead>
            <th width="10%">id</th><th width="15%">League Name</th><th width="10%">Country Name</th><th width="10%">League Manager</th><th width>Actions</th>
            </thead>
            <tbody>
            <c:forEach var="league" items="${leagues}">
                <tr>
                    <td>${league.leagueId}</td>
                    <td>${league.leagueName}</td>
                    <td>${league.countryName}</td>
                    <td>${league.leagueManager}</td>
                    <td>
                        <a href="${pageContext.servletContext.contextPath}/league/edit/${league.leagueId}">Edit</a><br/>
                        <a href="${pageContext.servletContext.contextPath}/league/delete/${league.leagueId}">Delete</a><br/>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
        </table>
        <br>
        <br>
        <a href="<c:url value='/league/add' />">Add New League</a>
    </body>
</html>
