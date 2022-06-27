package com.github.lipenathan.watchguide.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;

public class FabricaEntityManager {

    private static final String PERSISTENCE_UNIT_NAME = "watch_guide";

    public static EntityManager fabricar() {
        return Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME).createEntityManager();
    }
}
