<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Team page</h1>
        <p>
            ${message}<br/>
            <a href="team/add">1.Add new team</a><br/>
            <br>
            <a href="team/list">2.Team list</a><br/>

            <br><br>
            <a href="<c:url value='/logout' />">Log Out</a>
        </p>    </body>
</html>
