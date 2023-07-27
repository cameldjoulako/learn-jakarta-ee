<%-- 
    Document   : payer-livre
    Created on : 27 juil. 2023, 02:26:12
    Author     : Camel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Payer Livre</title>
    </head>
    <body>
        <p>Paiement effectué avec le numéro de carte: <%= numeroCarte = request.getParameter("numeroCarte"); %>  <br />
            Le numéro du livre payé est : ${sessionScope.livre.numeroLivre}<br />
    </body>
</html>
