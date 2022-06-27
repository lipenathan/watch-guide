package com.github.lipenathan.watchguide.repositorio;

import com.github.lipenathan.watchguide.dao.Dao;
import com.github.lipenathan.watchguide.modelo.Conteudo;
import com.github.lipenathan.watchguide.modelo.Tipo;
import org.junit.jupiter.api.Test;

public class TesteRepositorioFilme {

    private Dao<Conteudo> filmeDao = new Dao<>(Conteudo.class);

    @Test
    public void deveInserirFilme() {

    }

    @Test
    public void testeTipo() {
        System.out.println(Tipo.FUTEBOL_AMERICANO.descricao);
    }
}