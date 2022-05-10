package com.github.lipenathan.watchguide.modelo;

import java.time.LocalTime;

public class Esporte extends Conteudo{
    private String pais;
    private LocalTime duracaoAproximada;
    @Override
    public void notificarUsuario() {
        System.out.println("Seu jogo já vai começar");
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public LocalTime getDuracaoAproximada() {
        return duracaoAproximada;
    }

    public void setDuracaoAproximada(LocalTime duracaoAproximada) {
        this.duracaoAproximada = duracaoAproximada;
    }
}
