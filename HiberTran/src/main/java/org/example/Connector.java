package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Connector {
    protected SessionFactory sessionFactory;

    public Session getSession() {
        Configuration configuration = new Configuration().configure();
        configuration.addAnnotatedClass(User.class);
        configuration.addAnnotatedClass(Address.class);
        sessionFactory = configuration.buildSessionFactory();
        return sessionFactory.openSession();
    }
}
