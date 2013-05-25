<%-- 
    Document   : index
    Created on : 23/05/2013, 19:55:12
    Author     : Ivan Simionato
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Index</title>
    </head>
    <body>
        <form action="${pageContext.request.contextPath}/CadastroCliente.jsp" method="post">
            <input type="submit" value="Cadastro de clientes">
        </form>

        <form action="${pageContext.request.contextPath}/ClienteController" method="post">
            <input type="hidden" name="logica" value="listar"/>
            <input type="submit" value="Listar clientes"/>   
        </form>

        <form action="${pageContext.request.contextPath}/ClienteController" method="post">
            <input type="hidden" name="logica" value="alteracao"/>
            <input type="submit" value="Alterar um cliente"/>   
        </form>

        <form action="${pageContext.request.contextPath}/ClienteController" method="post">
             <input type="hidden" name="logica" value="apagar"/>
             <input type="submit" value="Apagar um cliente"/>
        </form>



    </body>
</html>
