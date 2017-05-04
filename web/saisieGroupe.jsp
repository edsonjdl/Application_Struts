<%-- 
    Document   : saisieGroupe
    Created on : May 3, 2017, 10:18:00 PM
    Author     : edson
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%-- 
    Tag de Struts
--%>

<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <html:form action="RechercheGr.do" method="POST">
            
            <table border="1">
                <thead>
                    <tr>
                        <th colspan="2">Choisir un groupe</th>                        
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>Groupes</td>
                        <td><html:select property="groupe">
                                <html:option value="1">G1</html:option>
                                <html:option value="2">G2</html:option>
                                <html:option value="3">G3</html:option>
                            </html:select>
                        </td>
                    </tr>
                    <tr>
                        <td colspan="2"><html:submit value="Envoyer" /></td>
                    </tr>
                </tbody>
            </table>

        </html:form>
    </body>
</html>
