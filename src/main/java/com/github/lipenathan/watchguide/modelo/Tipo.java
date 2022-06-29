package com.github.lipenathan.watchguide.modelo;

import java.util.Arrays;
import java.util.List;

public enum Tipo {
    FILME(1, "FILME"), SERIE(2, "SERIE"), MINISSERIE(3, "MINISSERIE") ,
    PROGRAMA(4, "PROGRAMA"), BASQUETE(5, "BASQUETE"), FUTEBOL(6, "FUTEBOL"),
    FUTEBOL_AMERICANO(7, "FUTEBOL AMERICANO"), TENIS(8, "TENIS"), REALITY_SHOW(9, "REALITY SHOW"),
    NOVELA(10, "NOVELA"), TELEJORNALISMO(11, "TELEJORNALISMO"), NENHUM(0, "SEM TIPO");

    private int id;
    private String descricao;

    Tipo(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public static Tipo getTipoById(int id) {
        switch (id) {
            case 1:
                return FILME;
            case 2:
                return SERIE;
            case 3:
                return MINISSERIE;
            case 4:
                return PROGRAMA;
            case 5:
                return BASQUETE;
            case 6:
                return FUTEBOL;
            case 7:
                return FUTEBOL_AMERICANO;
            case 8:
                return TENIS;
            case 9:
                return REALITY_SHOW;
            case 10:
                return NOVELA;
            case 11:
                return TELEJORNALISMO;
            default: return NENHUM;
        }
    }

    public static List<Tipo> todos() {
        return Arrays.asList(FILME, SERIE, MINISSERIE, PROGRAMA, BASQUETE, FUTEBOL, FUTEBOL_AMERICANO, TENIS, REALITY_SHOW,
                NOVELA, TELEJORNALISMO);
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }
}