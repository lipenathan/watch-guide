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
    @Enumerated(EnumType.STRING)
    private Tipo tipoConteudo;
    @Enumerated(EnumType.STRING)
    @Column(name = "id_tipo")
    private Genero genero;
    @ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    @JoinColumn(name = "")
    private Empresa empresa = new Empresa();

    public void validar() throws Exception{
        if (this.nome == null || this.nome.isEmpty())
            throw new Exception("O nome do conteúdo precisa ser preenchido");
        if (this.descricao == null || this.descricao.isEmpty())
            throw new Exception("A descrição do conteúdo precisa ser preenchido");
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

    public Tipo getTipoConteudo() {
        return tipoConteudo;
    }

    public void setTipoConteudo(Tipo tipoConteudo) {
        this.tipoConteudo = tipoConteudo;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
}
