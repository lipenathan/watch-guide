package com.github.lipenathan.watchguide.telas;

import com.github.lipenathan.watchguide.dao.Dao;
import com.github.lipenathan.watchguide.modelo.Conteudo;

import java.util.ArrayList;
import java.util.List;

public class ConteudoFrm {
    Dao<Conteudo> conteudoDao = new Dao<>(Conteudo.class);

    public List<Conteudo> conteudoStreaming() {
        List<Conteudo> conteudos = conteudoDao.buscarTodos();
        List<Conteudo> conteudosStreaming = new ArrayList<>();
        for (Conteudo c: conteudos) {
            if (c.isStreaming()) {
                conteudosStreaming.add(c);
            }
        }
        return conteudosStreaming;
    }

    public List<Conteudo> conteudoCanais() {
        List<Conteudo> conteudos = conteudoDao.buscarTodos();
        List<Conteudo> conteudosStreaming = new ArrayList<>();
        for (Conteudo c: conteudos) {
            if (!c.isStreaming()) {
                conteudosStreaming.add(c);
            }
        }
        return conteudosStreaming;
    }
}