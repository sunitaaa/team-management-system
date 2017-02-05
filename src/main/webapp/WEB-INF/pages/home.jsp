s
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    </head>
    <body>
        
        <p>Welcome to Home page <c:out value="${admin.firstName}" /></p>
        <h2>1.<a href="league">League Management</a></h2>
        <h2>2.<a href="team">Team Management</a></h2>
        <h2>3.<a href="player">Player Management</a></h2>
        <br>
        <br>
        <h2><a href="registration">Registration </a></h2>



    </body>
</html>
