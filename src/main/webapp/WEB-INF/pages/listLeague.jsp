<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>--%>
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
        <h1>List Of League</h1>
        <p><c:out value="${message}" /></p>
        <div class="container">
            <table class="table table-striped" border="1px" cellpadding="0" cellspacing="0">
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
        </div>
        <br>
        <br>
        <a href="<c:url value='/league/add' />">Add New League</a>
    </body>
</html>
