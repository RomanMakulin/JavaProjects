package org.example;

import org.hibernate.Session;

public class DB {
    Connector connector = new Connector();
    public void newUser(String name, String lastName, String userName, String pass){
        try(Session session = connector.getSession()){
            session.beginTransaction();
            session.save(new User(name, lastName, userName, pass));
            session.getTransaction().commit();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public void delUser(int id){
        try(Session session = connector.getSession()){
            session.beginTransaction();
            User needUser = session.get(User.class, id);
            session.delete(needUser);
            session.getTransaction().commit();
        }
    }
}
