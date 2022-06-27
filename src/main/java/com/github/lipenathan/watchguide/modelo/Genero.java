package com.github.lipenathan.watchguide.modelo;

import java.util.Arrays;
import java.util.List;

public enum Genero {
    ESPORTIVO(1, "ESPORTIVO"), CULINARIA(2,"CULINÁRIA"), COMEDIA(3,"COMÉDIA"),
    ACAO(4,"AÇÃO"), TERROR(5, "TERROR"), SUSPENSE(6, "SUSPENSE"),
    POLICIAL(7, "POLICAL"), DRAMA(8, "DRAMA");

    private int id;
    private String descricao;

    Genero(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public static List<Genero> todos() {
        return Arrays.asList(ESPORTIVO, CULINARIA, COMEDIA, ACAO, TERROR, SUSPENSE, POLICIAL, DRAMA);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}