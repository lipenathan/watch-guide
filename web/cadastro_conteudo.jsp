<%@ page import="java.util.List" %>
<%@ page import="com.github.lipenathan.watchguide.modelo.Tipo" %>
<%@ page import="com.github.lipenathan.watchguide.dao.Dao" %>
<%@ page import="com.github.lipenathan.watchguide.modelo.Empresa" %>
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
    <meta charset="charset=UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="resources/css/style.css">
</head>
<body>
<%--<div class="container nav-bar">--%>
<%--    <header>--%>
<%--        <nav>--%>
<%--            <div class="nav-container">--%>
<%--                <ul>--%>
<%--                    <li><a href="cadastro_conteudo.jsp">Cadastrar Conteúdo</a></li>--%>
<%--                    <li><a href="cadastro_conteudo.jsp">Programação e conteúdos</a></li>--%>
<%--                </ul>--%>
<%--            </div>--%>
<%--        </nav>--%>
<%--    </header>--%>
<%--</div>--%>
<main>
    <div>
        <%

        %>
        <form method="post" action="formCadastrar">
            <h2>Empresa</h2>
            <label for="nomeEmpresa">Nome empresa</label>
            <input id="nomeEmpresa" type="text" name="nomeEmpresa"/>
            <label for="numeroCanal">Número canal</label>
            <input id="numeroCanal" type="text" name="numeroCanal"/>
            <label for="preco">Preço Streaming</label>
            <input id="preco" type="text" name="preco"/><br/>
            <h2>Conteúdo</h2>
            <label for="nome">Título</label>
            <input id="nome" type="text" name="nome" placeholder="Título do conteúdo"/>
            <label for="descricao">Descrição</label>
            <input id="descricao" type="text" name="descricao" placeholder="Descrição do conteúdo"/>
            <label for="horario">Horário</label>
            <input id="horario" type="datetime-local" name="horario" placeholder="Horário do conteúdo"/>
<%--            <fmt:formatDate pattern="YYYY-MM-DDhh:mm" value="horario"/>--%>
            <%
                List<Tipo> comboTipos = Tipo.todos();
            %>
            <label for="tipo">Escolha um tipo de conteúdo</label>
            <select name="tipo" id="tipo" >
                <% for (Tipo tipo : comboTipos) {
                    out.print("<option value=\"" + tipo.id + "\">" + tipo.descricao + "</option>");
                }
                    ; %>
            </select>
            <label for="genero">Genero</label>
            <input id="genero" type="text" name="nome"/><br/>
            <input type="submit" value="Cadastrar">
        </form>
    </div>
</main>
</body>
</html>