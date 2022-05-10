package com.github.lipenathan.watchguide.processos;

import com.github.lipenathan.watchguide.modelo.Conteudo;

public class Notificacao {
    
    private Conteudo conteudo;

    public Notificacao(Conteudo conteudo) {
        this.conteudo = conteudo;
    }

    public void notificarUsuario() {
        conteudo.notificarUsuario();
    }
}