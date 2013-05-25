<%-- 
    Document   : ListarCliente
    Created on : 23/05/2013, 20:27:42
    Author     : Ivan Simionato
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listar clientes</title>
    </head>
    <body>
       
        <table>
            <tr>
                <th>ID</th>
                <th>NOME</th>
                <th>SOBRENOME</th>
                <th>CPF</th>
            </tr>
            
            <c:forEach items="${lista}" var="cliente">  
                <tr>
                    <td>${cliente.idcliente}</td>
                    <td>${cliente.nome}</td>
                    <td>${cliente.sobrenome}</td>
                    <td>${cliente.cpf}</td>     
                </tr>           
            </c:forEach>
            
            
        </table>
        
        
        
    </body>
</html>
