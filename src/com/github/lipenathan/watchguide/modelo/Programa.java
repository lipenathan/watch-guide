package com.github.lipenathan.watchguide.modelo;

import java.time.LocalTime;

public class Programa extends Conteudo{
    private LocalTime duracao;
    private Genero genero;

    @Override
    void notificarUsuario() {

    }

    public LocalTime getDuracao() {
        return duracao;
    }

    public void setDuracao(LocalTime duracao) {
        this.duracao = duracao;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }
}
