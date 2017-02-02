<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       
    </head>
    <body>
        <h1>Player page</h1>
        <p>
            ${message}<br/>
            <a href="player/add">1.Add new Player</a><br/>
            <br>
            <a href="player/list">2.Player list</a><br/>

            <br><br>
            <a href="<c:url value='/logout' />">Log Out</a>
        </p>    </body>
</html>
