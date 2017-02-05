<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <!-- Latest compiled and minified CSS -->
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
        <h1>Login Form</h1>

        <div style="color: red">${error}</div>
        <br><br>

        <form:form id="loginForm" method="post" action="login" modelAttribute="loginRequestDTO">

            <form:label path="email">Email:</form:label>
            <form:input id="email" name="email" path="email" />
            <form:errors path="email" cssClass="error"></form:errors>
                <br><br>

            <form:label path="password">Password:</form:label>

            <form:password id="password" name="password" path="password" />
            <form:errors path="password" cssClass="error"></form:errors>
                <br><br>
                <input type="submit" value="Submit" class="btn btn-success" />
                <br><br>


        </form:form>
    </body>
</html>
