<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
       

    </head>
    <body>
        <h1>Login Form</h1>

        <form:form id="loginForm" method="post" action="login" modelAttribute="loginRequestDTO">

            <form:label path="email">Email:</form:label>
            <form:input id="email" name="email" path="email" />
            <form:errors path="email" cssClass="error"></form:errors>
                <br>
                <br>


            <form:label path="password">Password:</form:label>

            <form:password id="password" name="password" path="password" />
            <form:errors path="password" cssClass="error"></form:errors>


                <br><br>

                <input type="submit" value="Submit" />
                <br><br>
                
                <div style="color: red">${error}</div>

        </form:form>
    </body>
</html>
