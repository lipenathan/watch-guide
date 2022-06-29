package com.github.lipenathan.watchguide.modelo;

import java.util.Arrays;
import java.util.List;

public enum Genero {
    ESPORTIVO(1, "ESPORTIVO"), CULINARIA(2,"CULINÁRIA"), COMEDIA(3,"COMÉDIA"),
    ACAO(4,"AÇÃO"), TERROR(5, "TERROR"), SUSPENSE(6, "SUSPENSE"),
    POLICIAL(7, "POLICAL"), DRAMA(8, "DRAMA"), NENHUM(0, "SEM GÊNERO");

    private int id;
    private String descricao;

    Genero(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public static List<Genero> todos() {
        return Arrays.asList(ESPORTIVO, CULINARIA, COMEDIA, ACAO, TERROR, SUSPENSE, POLICIAL, DRAMA);
    }

    public static Genero getGeneroById(int id) {
        switch (id) {
            case 1:
                return ESPORTIVO;
            case 2:
                return CULINARIA;
            case 3:
                return COMEDIA;
            case 4:
                return ACAO;
            case 5:
                return TERROR;
            case 6:
                return SUSPENSE;
            case 7:
                return POLICIAL;
            case 8:
                return DRAMA;
            default: return NENHUM;
        }
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }
}