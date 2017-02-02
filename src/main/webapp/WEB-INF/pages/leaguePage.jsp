<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>League page</h1>
        <p>
            ${message}<br/>
            <a href="league/add">1.Add new League</a><br/>
            <br>
            <a href="league/list">2.League list</a><br/>
            <br><br>
             <a href="<c:url value='/logout' />">Log Out</a>
        </p>    </body>
</html>
