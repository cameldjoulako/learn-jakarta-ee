<%-- 
    Document   : helloworld
    Created on : 26 juil. 2023, 04:51:41
    Author     : Camel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World JSP</h1>
        <%
            int nombre  = 20;
            
            if(nombre == 20) {
            %>   
            Le nombre vaut: <%= nombre %>
            
            <%
            }
        %>
    </body>
</html>
