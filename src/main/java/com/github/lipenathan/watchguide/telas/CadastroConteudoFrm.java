package com.github.lipenathan.watchguide.telas;

import com.github.lipenathan.watchguide.modelo.Conteudo;
import com.github.lipenathan.watchguide.modelo.Empresa;
import com.github.lipenathan.watchguide.modelo.Tipo;
import com.github.lipenathan.watchguide.processos.ProcessoCadastroConteudo;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@WebServlet(name = "formCadastrar", value = "/formCadastrar")
public class CadastroConteudoFrm extends HttpServlet {
    private final ProcessoCadastroConteudo processoCadastro = new ProcessoCadastroConteudo();
    Empresa empresa = new Empresa();
    Conteudo conteudo = new Conteudo();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-DD'T'hh:mm");
        try {
            String nomeEmpresa = req.getParameter("nomeEmpresa");
            String numeroCanal = req.getParameter("numeroCanal");
            String precoStreaming = req.getParameter("preco");
            String nome = req.getParameter("nome");
            String descricao = req.getParameter("descricao");
            String horarioString = req.getParameter("horario");
            String tipo = req.getParameter("tipo");
            Date data = sdf.parse(horarioString);
            empresa.setNome(nomeEmpresa);
            empresa.setNumeroCanal(numeroCanal.isEmpty()? 0 : Integer.parseInt(numeroCanal));
            empresa.setPreco(precoStreaming.isEmpty()? 0.0 : Double.parseDouble(precoStreaming));
            conteudo.setEmpresa(empresa);
            conteudo.setNome(nome);
            conteudo.setDescricao(descricao);
            conteudo.setHorario(data);
            conteudo.setTipoConteudo(Tipo.getTipoById(Integer.parseInt(tipo)));
            processoCadastro.cadastrarConteudo(conteudo);
            resp.sendRedirect("cadastro_conteudo.jsp");
        } catch (Exception e) {
            //todo criar página com tratamento de erro
            throw new RuntimeException(e);
        }
    }
}