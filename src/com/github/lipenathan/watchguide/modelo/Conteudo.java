package com.github.lipenathan.watchguide.modelo;

import java.time.LocalDateTime;

public abstract class Conteudo {
    private String nome;
    private String descricao;
    private LocalDateTime horario;
    abstract void notificarUsuario();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDateTime getHorario() {
        return horario;
    }

    public void setHorario(LocalDateTime horario) {
        this.horario = horario;
    }
}
