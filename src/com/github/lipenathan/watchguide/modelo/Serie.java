package com.github.lipenathan.watchguide.modelo;

import java.time.LocalTime;
import java.util.List;

public class Serie extends Conteudo{

    private Integer temporadas;
    private List<String> diretores;
    private List<String> atores;
    private LocalTime duracaoEpisodios;
    private Genero genero;

    @Override
    void notificarUsuario() {
        System.out.println("Sua série ja vai começar");
    }

    public Integer getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(Integer temporadas) {
        this.temporadas = temporadas;
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

    public LocalTime getDuracaoEpisodios() {
        return duracaoEpisodios;
    }

    public void setDuracaoEpisodios(LocalTime duracaoEpisodios) {
        this.duracaoEpisodios = duracaoEpisodios;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }
}