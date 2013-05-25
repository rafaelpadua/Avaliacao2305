<%-- 
    Document   : CadastroCliente
    Created on : 23/05/2013, 20:07:10
    Author     : Ivan Simionato
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro de cliente</title>
    </head>
    <body>
        
        <form method="post" action="${pageContext.request.contextPath}/ClienteController">
        <label>
            Nome:
            <input type="text" maxlength="45" name="nome">
        </label>
        
        <label>
             Sobrenome:
            <input type="text" maxlength="45" name="sobrenome">
        </label>
        
         <label>
             CPF:
            <input type="text" maxlength="45" name="cpf">          
        </label>
        
        <input type="hidden" value="salvar" name="logica">
        <input type="submit" value="Salvar">
        </form>
    </body>
</html>
