package com.presupuestos.presupuestos.listeners;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import com.presupuestos.presupuestos.entity.Item;

public class InicializeItemsListener implements ServletContextListener, HttpSessionListener, HttpSessionAttributeListener {


    public InicializeItemsListener() {
    }

    @Override
    public void contextInitialized(ServletContextEvent sce)
    {
        Item item1 = new Item("Cantidad de asistentes", 300.0);
        Item item2 = new Item("Salón", 300.0);
        Item item3 = new Item("Catering", 300.0);
        Item item4 = new Item("Barra libre", 300.0);
        Item item5 = new Item("Vino", 300.0);
        Item item6 = new Item("Champagne", 300.0);
        Item item7 = new Item("Torta", 300.0);
        Item item8 = new Item("Animación de la boda y DJ", 300.0);
        Item item9 = new Item("Ceremonia (flores, decoración, sillas, mesa, alfombra)", 300.0);
        Item item10 = new Item("Invitaciones", 300.0);
        Item item11 = new Item("Alianzas", 300.0);
        Item item12 = new Item("Servicio de Video y Fotografía", 300.0);

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("presupuestos");
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();

        em.persist(item1);
        em.persist(item2);
        em.persist(item3);
        em.persist(item4);
        em.persist(item5);
        em.persist(item6);
        em.persist(item7);
        em.persist(item8);
        em.persist(item9);
        em.persist(item10);
        em.persist(item11);
        em.persist(item12);

        transaction.commit();
        em.close();
    }
}