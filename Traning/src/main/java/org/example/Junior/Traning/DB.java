package org.example.Junior.Traning;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;

import java.util.List;

public class DB {
    public static void connectDB() {
        Connector connector = new Connector();
        try (Session session = connector.getSession()) {

            //region update user
//            String hql = "FROM User where id = :id";
//            Query<User> query = session.createQuery(hql, User.class);
//            query.setParameter("id", 2);
//
//            User user = query.getSingleResult();
//            user.setAge(21);
//
//            session.beginTransaction();
//            session.update(user);
//            session.getTransaction().commit();
            //endregion

            //region show all in console
//            List<User> userList = session.createQuery("FROM User", User.class).getResultList();
//            userList.forEach(System.out::println);
            //endregion

            //region delete all
//            Transaction transaction = session.beginTransaction();
//            List<User> userList = session.createQuery("FROM User", User.class).getResultList();
//
//            userList.forEach(session::delete);
//            transaction.commit();
            //endregion

            //region delete one
//            String hql = "FROM User where id = :id";
//            Query<User> query = session.createQuery(hql, User.class);
//            query.setParameter("id", 2);
//
//            session.beginTransaction();
//            session.delete(query.getSingleResult());
//            session.getTransaction().commit();
            //endregion

            //region CREATE USER
//        User user = new User("Ann", 23);
//
//        session.beginTransaction();
//        session.save(user);
//
//        user = new User("Milka", 2); session.save(user);
//        user = new User("Olga", 50); session.save(user);
//
//        session.getTransaction().commit();
//        session.close();
            //endregion

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
