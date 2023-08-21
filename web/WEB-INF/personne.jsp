<%-- 
    Document   : personne
    Created on : 21 Aug 2023, 22:53:55
    Author     : mathi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <p>Récupération du bean grâce à la clé "alphonse" :
            <%
            Beans.Personne unBean = (Beans.Personne)
           request.getAttribute("alphonse");
            <p>Utilisation de la méthode toString() du bean dans la vue :
            <%= unBean.toString() %>
        </p>
            %>
        </p>

    </body>
</html>
