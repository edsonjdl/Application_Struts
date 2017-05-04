<%-- 
    Document   : afficherEtudiants.jsp
    Created on : May 3, 2017, 10:34:56 PM
    Author     : edson
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
        <c:forEach var="unEtudiant" items="${liste}">
            ${unEtudiant.nom}&nbsp;&nbsp;
            ${unEtudiant.prenom}<br>
        </c:forEach>
    </body>
</html>
