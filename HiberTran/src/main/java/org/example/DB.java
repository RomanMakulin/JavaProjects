package org.example;

import org.hibernate.Session;

public class DB {
    Connector connector = new Connector();
    public void newUser(String name, String lastName, int age, Address address){
        try(Session session = connector.getSession()){
            session.beginTransaction();
            User user1 = new User(name, lastName, age, address);
            session.save(user1);
            session.getTransaction().commit();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public void getByID(int id){
        try(Session session = connector.getSession()){
            session.beginTransaction();
            User needUser = session.get(User.class, id);
            System.out.println(needUser);
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
