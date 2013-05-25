<%-- 
    Document   : ApagarCliente
    Created on : 24/05/2013, 13:05:12
    Author     : Ivan Simionato
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Apagar cliente</title>
    </head>
    <body>
        <form action="${pageContext.request.contextPath}/ClienteController" method="post">
            <select name="id">
                <c:forEach items="${lista}" var="cliente">
                    <option value=${cliente.idcliente}>${cliente.nome}</option>  
                </c:forEach>
            </select>
             <input type="submit" value="Apagar"/>
            <input type="hidden" name="logica" value="deletar"/>
        </form>
    </body>
</html>
