<%-- 
    Document   : accessdenied
    Created on : Sep 12, 2013, 2:44:34 PM
    Author     : francisco
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Bloqueado a nivel HTTP</title>
    </head>
    <body>
        <h1>Bloqueado a nivel de HTTP</h1><br>
        <a href="<c:url value="/j_spring_security_logout" />" > Logout</a>
    </body>
</html>
