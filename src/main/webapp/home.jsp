<%-- 
    Document   : home
    Created on : 21 août 2023, 13:19:39
    Author     : Camel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Online store - Gestion de la boutique</h1>
        <c:if test="${not empty login}">
            Bonjour ${login}   (<a href="logout">Deconnexion</a>) <br />
        </c:if>
        
        <a href="add-work-form.html">Ajouter une oeuvre au catalogue</a> <br />
        <a href="catalogue.jsp">Accès au catalogue</a> <br />
        
    </body>
</html>
