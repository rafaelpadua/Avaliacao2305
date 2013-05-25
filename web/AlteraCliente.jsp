<%-- 
    Document   : AlteraCliente
    Created on : 23/05/2013, 21:19:16
    Author     : Ivan Simionato
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Alterar cliente</title>
    </head>
    <body>

        <form action="${pageContext.request.contextPath}/ClienteController" method="post">
            <select name="id">
                <c:forEach items="${lista}" var="cliente">
                    <option value=${cliente.idcliente}>${cliente.nome}</option>  
                </c:forEach>
            </select>
            <input type="submit" value="Alterar"/>
            <input type="hidden" name="logica" value="alterar"/>
        </form>

        <form action="${pageContext.request.contextPath}/ClienteController" method="post">
            <label>
                ID:
                <input type="text" maxlength="45" name="idcliente" value="${clienti.idcliente}"/>   
            </label>
            <label>
                Nome:
                <input type="text" maxlength="45" name="nome" value="${clienti.nome}"/>
            </label>

            <label>
                Sobrenome:
                <input type="text" maxlength="45" name="sobrenome" value="${clienti.sobrenome}"/>
            </label>

            <label>
                CPF:
                <input type="text" maxlength="45" name="cpf" value="${clienti.cpf}"/>          
            </label>
            <input type="hidden" value="update" name="logica"/>
            <input type="submit" value="Salvar"/>
        </form>


    </body>
</html>
