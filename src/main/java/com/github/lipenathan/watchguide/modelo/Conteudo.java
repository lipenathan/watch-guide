package com.github.lipenathan.watchguide.modelo;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "conteudo")
public class Conteudo implements Serializable {

    @Id
    @Column(name = "id_conteudo")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "nome_conteudo")
    private String nome;
    @Column(name = "descricao_conteudo")
    private String descricao;
    @Column(name = "horario_conteudo")
    private Date horario;
    @Column(name = "id_tipo")
    private int tipoConteudo;
    @Column(name = "id_genero")
    private Integer genero = null;
    @ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    @JoinColumn(name = "id_empresa")
    private Empresa empresa = new Empresa();
    private String imagem;

    public void validar() throws Exception{
        if (this.nome == null || this.nome.isEmpty())
            throw new Exception("O nome do conteúdo precisa ser preenchido");
        if (this.descricao == null || this.descricao.isEmpty())
            throw new Exception("A descrição do conteúdo precisa ser preenchido");
    }

    public boolean isStreaming() {
        return empresa.getPreco() != 0 && empresa.getNumeroCanal() == 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Date getHorario() {
        return horario;
    }

    public void setHorario(Date horario) {
        this.horario = horario;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public int getTipoConteudo() {
        return tipoConteudo;
    }

    public void setTipoConteudo(int tipoConteudo) {
        this.tipoConteudo = tipoConteudo;
    }

    public Integer getGenero() {
        return genero;
    }

    public void setGenero(int genero) {
        this.genero = genero;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }
}
