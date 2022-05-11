package com.github.lipenathan.watchguide.modelo;

import java.time.LocalDateTime;

public abstract class Conteudo {
    private String nome;
    private String descricao;
    private LocalDateTime horario;
    public abstract void notificarUsuario();

    public void validar() throws Exception{
        if (this.nome == null || this.nome.isEmpty())
            throw new Exception("O nome do conteúdo precisa ser preenchido");
        if (this.descricao == null || this.descricao.isEmpty())
            throw new Exception("A descrição do conteúdo precisa ser preenchido");
        if (this.horario == null)
            throw new Exception("O horário do conteúdo precisa ser preenchido");
    }

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
