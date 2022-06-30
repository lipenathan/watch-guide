package com.github.lipenathan.watchguide.telas;

import com.github.lipenathan.watchguide.modelo.Conteudo;
import com.github.lipenathan.watchguide.modelo.Empresa;
import com.github.lipenathan.watchguide.processos.ProcessoCadastroConteudo;

import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

@MultipartConfig
@WebServlet(name = "formCadastrar", value = "/formCadastrar")
public class CadastroConteudoFrm extends HttpServlet {
    private final ProcessoCadastroConteudo processoCadastro = new ProcessoCadastroConteudo();
    Empresa empresa = new Empresa();
    Conteudo conteudo = new Conteudo();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html;charset=UTF-8");
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-DD'T'hh:mm");
        try {
            String nomeEmpresa = req.getParameter("nomeEmpresa");
            String numeroCanal = req.getParameter("numeroCanal");
            String precoStreaming = req.getParameter("preco");
            String nome = req.getParameter("nome");
            String descricao = req.getParameter("descricao");
            String horarioString = req.getParameter("horario");
            String tipo = req.getParameter("tipo");
            String genero = req.getParameter("genero");
            Part img = req.getPart("img");
            if (!horarioString.isEmpty()) {
                Date data = sdf.parse(horarioString);
                conteudo.setHorario(data);
            }
            empresa.setNome(nomeEmpresa);
            empresa.setNumeroCanal(numeroCanal.isEmpty() ? 0 : Integer.parseInt(numeroCanal));
            empresa.setPreco(precoStreaming.isEmpty() ? 0.0 : Double.parseDouble(precoStreaming));
            conteudo.setEmpresa(empresa);
            conteudo.setNome(nome);
            conteudo.setDescricao(descricao);
            if (tipo != null) {
                conteudo.setTipoConteudo(Integer.parseInt(tipo));
            }
            if (tipo != null) {
                conteudo.setGenero(Integer.parseInt(genero));
            }
            if (img != null) {
                //upload imagem
                String nomeImagem = img.getSubmittedFileName();
                String caminho = "D://worspace-facul/watch-guide/web/resources/images/" + nomeImagem;
                String imagem = "resources/images/" + nomeImagem;
                conteudo.setImagem(imagem);
                InputStream is = img.getInputStream();
                boolean uploadOk = uploadImagem(is, caminho);
                if (!uploadOk) {
                    req.setAttribute("mensagem", "Erro ao subir imagem");
                    resp.sendRedirect("cadastro_conteudo.jsp");
                    return;
                }
            }
            processoCadastro.cadastrarConteudo(conteudo);
//            req.setAttribute("mensagem", "Conteúdo Cadastrado com sucesso");
            resp.sendRedirect("mensagem.jsp?mensagem=" + "Conteúdo Cadastrado com sucesso");
        } catch (Exception e) {
            e.printStackTrace();
            req.setAttribute("mensagem", e.getMessage());
            resp.sendRedirect("mensagem.jsp");
        }
    }

    private boolean uploadImagem(InputStream inputStream, String caminho) {
        boolean test = false;
        try {
            byte[] bytes = new byte[inputStream.available()];
            inputStream.read();
            FileOutputStream fops = new FileOutputStream(caminho);
            fops.write(bytes);
            fops.flush();
            fops.close();
            test = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return test;
    }
}