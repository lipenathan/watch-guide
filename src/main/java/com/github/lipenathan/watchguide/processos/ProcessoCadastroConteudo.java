package com.github.lipenathan.watchguide.processos;

import com.github.lipenathan.watchguide.dao.Dao;
import com.github.lipenathan.watchguide.modelo.Conteudo;

public class ProcessoCadastroConteudo {

    Dao<Conteudo> daoConteudo;

    public ProcessoCadastroConteudo() {
        this.daoConteudo = new Dao<>(Conteudo.class);
    }

    public void cadastrarConteudo(Conteudo conteudo) throws Exception {
        conteudo.validar();
        daoConteudo.inserir(conteudo);
    }
}