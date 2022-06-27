package com.github.lipenathan.watchguide.modelo;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "empresa")
public class Empresa implements Serializable {
    @Id
    @Column(name = "id_empresa")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "nome_empresa")
    private String nome;
    @Column(name = "numero_canal")
    private int numeroCanal;
    @Column(name = "preco_streaming")
    private double preco;

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

    public int getNumeroCanal() {
        return numeroCanal;
    }

    public void setNumeroCanal(int numeroCanal) {
        this.numeroCanal = numeroCanal;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
