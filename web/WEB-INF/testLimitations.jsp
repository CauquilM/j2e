<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ page import="java.util.List"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Test des limitations de JSP et EL</title>
    </head>
    <body>
        <p>
            Récupération du jour du mois :<br />
            <%
             Integer jourDuMois = (Integer) request.getAttribute( "jour"
            );
             if ( 0 == jourDuMois % 2 ) {
             out.println( "Jour pair : " + jourDuMois );
             } else {
             out.println( "Jour impair : " + jourDuMois );
             }
            %>
        </p>
        <hr />
    </body>
</html>
