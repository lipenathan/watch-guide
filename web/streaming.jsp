<%@ page import="java.util.List" %>
<%@ page import="com.github.lipenathan.watchguide.modelo.Conteudo" %>
<%@ page import="com.github.lipenathan.watchguide.modelo.Tipo" %>
<%@ page import="com.github.lipenathan.watchguide.modelo.Genero" %>
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
    <title>Streaming</title>
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
            <li><a href="programacao.jsp">Programação</a></li>
            <li><a href="streaming.jsp">Streamings</a></li>
        </ul>
    </nav>
    <a class="login" href="#">
        <button>Login</button>
    </a>
</header>
<main>
<%--    <%--%>
<%--        ConteudoFrm frm = new ConteudoFrm();--%>
<%--        List<Conteudo> conteudos = frm.conteudoStreaming();--%>
<%--    %>--%>
<%--    <table>--%>
<%--        <tr>--%>
<%--            <th>Tìtulo</th>--%>
<%--            <th>Streaming</th>--%>
<%--            <th>Descrição</th>--%>
<%--            <th>Tipo</th>--%>
<%--            <th>Genero</th>--%>
<%--        </tr>--%>
<%--        <tr>--%>
<%--            <% for (Conteudo conteudo : conteudos) {--%>
<%--                out.print("<tr>");--%>
<%--                out.print("<td>" + conteudo.getNome() + "</td>");--%>
<%--                out.print("<td>" + conteudo.getEmpresa().getNome() + "</td>");--%>
<%--                out.print("<td>" + conteudo.getDescricao() + "</td>");--%>
<%--                out.print("<td>" + Tipo.getTipoById(conteudo.getTipoConteudo()).getDescricao() + "</td>");--%>
<%--                out.print("<td>" + Genero.getGeneroById(conteudo.getGenero() == null ? 0 : conteudo.getGenero()) + "</td>");--%>
<%--                out.print("</tr>");--%>
<%--            } %>--%>
<%--        </tr>--%>
<%--    </table>--%>
    <div class="slide-container swiper">
        <div class="slide-content">
            <div class="card-wrapper swiper-wrapper">
                <div class="card swiper-slide">
                    <div class="image-content">
                        <span class="overlay"></span>

                        <div class="card-image">
                            <img src="resources/images/stranger_things.jpg" alt="teste" class="card-img">
                        </div>

                    </div>
                    <div class="card-content">
                        <h2 class="titulo">Exemplo</h2>
                        <p class="descricao">Este é um exemplo de descrição que ja ja será usado com jsp</p>
                        <button class="button">View More</button>
                    </div>
                </div>
            </div>
        </div>
        <div class="swiper-button-next"></div>
        <div class="swiper-button-prev"></div>
        <div class="swiper-pagination"></div>
    </div>
</main>
</body>
<script src="resources/js/swiper-bundle.min.js"></script>
<script src="resources/js/script.js"></script>
</html>