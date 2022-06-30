<%@ page import="java.util.List" %>
<%@ page import="com.github.lipenathan.watchguide.modelo.Conteudo" %>
<%@ page import="com.github.lipenathan.watchguide.telas.ConteudoFrm" %>

<%--
  Created by IntelliJ IDEA.
  User: lipen
  Date: 08/06/2022
  Time: 21:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
</!doctype html>
<html>
<head>
    <title>TV</title>
    <meta charset="charset=UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="resources/css/style.css">
    <link rel="stylesheet" href="resources/css/swiper-bundle.min.css"/>
</head>
<body>
<header>
    <nav>
        <ul class="nav-links">
            <li><a href="cadastro_conteudo.jsp">Cadastrar Conteúdo</a></li>
            <li><a href="tv.jsp">TV</a></li>
            <li><a href="streaming.jsp">Streamings</a></li>
        </ul>
    </nav>
    <a class="login" href="#">
        <button>Login</button>
    </a>
</header>
<main>
    <div style="display:flex; justify-content: center">
        <%
            String mensagem = request.getParameter("mensagem");
            out.print("<h2>" + mensagem + "</h2>");
        %>
    </div>
</main>
</body>
</html>