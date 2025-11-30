package org.model;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("un-jpa");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Usuario usuario = new Usuario();
        usuario.setNome("Guilherme");
        usuario.setEmail("guilhermelopesinocencio@gmail.com");
        usuario.setSenha("2395");

        em.persist(usuario);

        em.getTransaction().commit();
        em.close();
        emf.close();
    }
}
