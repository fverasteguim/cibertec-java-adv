<%-- 
    Document   : listAutor
    Created on : 01/11/2013, 08:49:03 PM
    Author     : Francisco
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
 
</head>
 
<body>
    <table>
        <tr>
            <td><h1>Mantenimiento de Roles</h1></td>
            <td style="text-align: right;"><a href="<c:url value='/j_spring_security_logout' />">Logout</a></td>
        </tr>
    </table>

 

<table>
    <tr>
    <th>ID</th>
    <th>Nombre</th>
    <th>Accion</th>
    </tr>
<s:iterator value="roles">
    <tr><td><s:property value="idRole"/></td>
        <td><s:property value="name"/></td>
        <td><a href="eliminarRole?id=<s:property value="idRole"/>">Eliminar</a></td>
    </tr>
</s:iterator>
</table>
<a href="newRole">Agregar nuevo rol</a>
</body>
</html>
