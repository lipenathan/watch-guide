package com.github.lipenathan.watchguide.modelo;

import java.time.LocalTime;
import java.util.List;

public class Filme extends Conteudo{
    private LocalTime duracao;
    private List<String> diretores;
    private List<String> atores;
    private Genero genero;

    @Override
    void notificarUsuario() {
        System.out.println("Seu filme já vai começar");
    }

    public LocalTime getDuracao() {
        return duracao;
    }

    public void setDuracao(LocalTime duracao) {
        this.duracao = duracao;
    }

    public List<String> getDiretores() {
        return diretores;
    }

    public void setDiretores(List<String> diretores) {
        this.diretores = diretores;
    }

    public List<String> getAtores() {
        return atores;
    }

    public void setAtores(List<String> atores) {
        this.atores = atores;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }
}