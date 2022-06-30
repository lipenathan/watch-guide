<%@ page import="java.util.List" %>
<%@ page import="com.github.lipenathan.watchguide.modelo.Tipo" %>
<%@ page import="com.github.lipenathan.watchguide.dao.Dao" %>
<%@ page import="com.github.lipenathan.watchguide.modelo.Empresa" %>
<%@ page import="com.github.lipenathan.watchguide.modelo.Genero" %>
<%@ page import="com.github.lipenathan.watchguide.telas.CadastroConteudoFrm" %>
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
    <title>Novo Conteúdo</title>
    <meta charset="charset=UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="resources/css/style.css">
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
    <a class="login" href="streaming.jsp">
        <button>Watch Guide</button>
    </a>
</header>
<main>
    <div class="conteudo-principal">
        <%
            Dao<Empresa> empresaDao = new Dao<>(Empresa.class);
            List<Empresa> empresas = empresaDao.buscarTodos();
            CadastroConteudoFrm frm = new CadastroConteudoFrm();
        %>
        <label for="empresa">Escolha a Empresa</label>
        <select name="nomeEmpresa" id="empresa">
            <option value="" disabled selected>Selecione uma empresa</option>
            <% for (Empresa empresa : empresas) {
                out.print("<option value=\"" + empresa.getId() + "\">" + empresa.getNome() + "</option>");
            }
                ; %>
        </select>
        <form method="post" action="formCadastrar" enctype="multipart/form-data">
            <h2>Empresa</h2>
            <label for="nomeEmpresa">Nome empresa</label>
            <input id="nomeEmpresa" type="text" name="nomeEmpresa"/><br/>
            <label for="numeroCanal">Número canal</label>
            <input id="numeroCanal" type="text" name="numeroCanal"/><br/>
            <label for="preco">Preço Streaming</label>
            <input id="preco" type="text" name="preco"/><br/><br/>
            <h2>Conteúdo</h2>
            <label for="nome">Título</label>
            <input id="nome" type="text" name="nome" placeholder="Título do conteúdo"/><br/>
            <label for="descricao">Descrição</label>
            <input id="descricao" type="text" name="descricao" placeholder="Descrição do conteúdo"/><br/>
            <label for="horario">Horário</label>
            <input id="horario" type="datetime-local" name="horario" placeholder="Horário do conteúdo"/><br/>
            <%
                List<Tipo> comboTipos = Tipo.todos();
            %>
            <label for="tipo">Escolha um tipo de conteúdo</label>
            <select name="tipo" id="tipo">
                <option value="" disabled selected>Selecione o tipo</option>
                <% for (Tipo tipo : comboTipos) {
                    out.print("<option value=\"" + tipo.getId() + "\">" + tipo.getDescricao() + "</option>");
                }
                    ; %>
            </select><br/>
            <%
                List<Genero> comboGenero = Genero.todos();
            %>
            <label for="genero">Escolha um gênero</label>
            <select name="genero" id="genero">
                <option value="" disabled selected>Selecione um gênero</option>
                <% for (Genero genero : comboGenero) {
                    out.print("<option value=\"" + genero.getId() + "\">" + genero.getDescricao() + "</option>");
                }
                    ; %>
            </select><br/>
            <input type="file"
                   id="img" name="img"
                   accept="image/png, image/jpeg">
            <br/>
            <input type="submit" value="Cadastrar">
        </form>
    </div>
</main>
</body>
<script>
    const iptEmpresa = document.getElementById('nomeEmpresa')
    iptEmpresa.ariaDisabled = true
    const iptNumeroCanal = document.getElementById('numeroCanal')
    iptNumeroCanal.ariaDisabled = true
    const iptPreco = document.getElementById('preco')
    iptPreco.ariaDisabled = true
</script>
</html>