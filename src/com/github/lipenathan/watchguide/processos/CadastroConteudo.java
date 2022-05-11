package com.github.lipenathan.watchguide.processos;

import com.github.lipenathan.watchguide.dao.Dao;
import com.github.lipenathan.watchguide.modelo.Conteudo;

public class CadastroConteudo {

    Dao<Conteudo> daoConteudo;

    public CadastroConteudo(Dao<Conteudo> daoConteudo) {
        this.daoConteudo = daoConteudo;
    }

    public void cadastrarConteudo(Conteudo conteudo) throws Exception {
        conteudo.validar();
        daoConteudo.inserir(conteudo);
    }
}
