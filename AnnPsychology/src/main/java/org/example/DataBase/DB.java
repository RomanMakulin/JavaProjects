package org.example.DataBase;

import org.example.Model.User;
import org.hibernate.Session;

import java.util.List;

public class DB {
    Connector connector = new Connector();

    public void getAllUsersInConsole(){
        try(Session session = connector.getSession()){
            List<User> userList = session.createQuery("FROM User", User.class).getResultList();
            userList.forEach(System.out::println);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
