<%-- 
    Document   : nuevoAutor
    Created on : 01/11/2013, 08:57:47 PM
    Author     : Francisco
--%>

<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
 
 
</head>
 
<body>
<h1>Nuevo Role</h1>
 
<s:form action="guardarRole">
        <s:textfield label="Nombres" name="role.name"/>
	<s:submit value="Guardar"/>
</s:form>
 
</body>
</html>
