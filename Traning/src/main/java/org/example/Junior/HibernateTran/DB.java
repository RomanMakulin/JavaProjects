package org.example.Junior.HibernateTran;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class DB {
    Connector connector = new Connector();

    public void updateUserAge(int id, int age){
        try (Session session = connector.getSession()) {
            String hql = "FROM User where id = :id";
            Query<User> query = session.createQuery(hql, User.class);
            query.setParameter("id", id);

            User user = query.getSingleResult();
            user.setAge(age);

            session.beginTransaction();
            session.update(user);
            session.getTransaction().commit();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void showAllUsersInConsole(){
        try (Session session = connector.getSession()) {
            List<User> userList = session.createQuery("FROM User", User.class).getResultList();
            userList.forEach(System.out::println);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteAllUsers(){
        try (Session session = connector.getSession()) {
            Transaction transaction = session.beginTransaction();
            List<User> userList = session.createQuery("FROM User", User.class).getResultList();
            userList.forEach(session::delete);
            transaction.commit();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteOneUserByID(int id){
        try (Session session = connector.getSession()) {
            String hql = "FROM User where id = :id";
            Query<User> query = session.createQuery(hql, User.class);
            query.setParameter("id", id);

            session.beginTransaction();
            session.delete(query.getSingleResult());
            session.getTransaction().commit();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void createUser(List<User> user){
        try (Session session = connector.getSession()) {
            session.beginTransaction();
            user.forEach(session::save);
            session.getTransaction().commit();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
