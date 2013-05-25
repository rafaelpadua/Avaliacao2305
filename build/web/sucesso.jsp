<%-- 
    Document   : sucesso
    Created on : 24/05/2013, 13:25:07
    Author     : Ivan Simionato
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SUCESSO!</title>
    </head>
    <body>
        <h1>OPERACAO CONCLUIDA COM SUCESSO</h1>
        <h3>${sucesso}</h3>
        <br>
        <br>
        <h3><a href="${pageContext.request.contextPath}/index.jsp">Voltar ao index</a></h3>
    </body>
</html>
