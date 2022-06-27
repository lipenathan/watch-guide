package com.github.lipenathan.watchguide.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

import java.util.List;

public class Dao <T>{

    private EntityManager entityManager;
    private EntityTransaction transaction;
    private Class<T> entidade;

    public Dao(Class<T> entidade) {
        this.entidade = entidade;
        this.entityManager = FabricaEntityManager.fabricar();
        this.transaction = entityManager.getTransaction();
    }

    public void inserir(T o) {
        transaction.begin();
        entityManager.persist(o);
        transaction.commit();
    }

    public T buscarPorId(int id) {
        return (T) entityManager.createQuery("select t from " + entidade.getSimpleName() + " t where t.id = :id")
                .setParameter("id", id).getSingleResult();
    }

    public List<T> buscarTodos() {
        return entityManager.createQuery("select t from " + entidade.getSimpleName() + " t").getResultList();
    }

    public void atualizar(T o) {
        transaction.begin();
        entityManager.merge(o);
        transaction.commit();
    }
}
