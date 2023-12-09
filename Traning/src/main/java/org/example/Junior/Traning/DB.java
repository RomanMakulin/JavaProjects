package org.example.Junior.Traning;

import org.hibernate.Session;

import java.sql.*;
import java.time.LocalDate;
import java.util.List;

public class DB {
    public static void connectDB(){
        Connector connector = new Connector();

        try(Session session = connector.getSession()){
            List<User> userList = session.createQuery("FROM Users", User.class).getResultList();
            userList.forEach(System.out::println);
        } catch (Exception e){
            e.printStackTrace();
        }



        // create new user
//        Session session = connector.getSession();

//        User user = new User("Ann", "Novik", "Sergeevna", 23, Date.valueOf(LocalDate.now()), "some info", 1, 1,
//                null, 0);
//
//        session.beginTransaction();
//        session.save(user);
//
//        session.getTransaction().commit();
//        session.close();
    }
}
