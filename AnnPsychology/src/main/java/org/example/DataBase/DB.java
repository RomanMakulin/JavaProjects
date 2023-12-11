package org.example.DataBase;

import org.example.DataBase.UpdateUser.UpdateFirstName;
import org.example.Model.User;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;
import java.util.Scanner;

public class DB {
    Connector connector = new Connector();
    public void getAllUsers(){
        try(Session session = connector.getSession()){
            List<User> userList = session.createQuery("FROM User", User.class).getResultList();
            userList.forEach(System.out::println);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void deleteAllUsers(){
        try(Session session = connector.getSession()){
            List<User> userList = session.createQuery("FROM User", User.class).getResultList();
            session.beginTransaction();
            userList.forEach(session::delete);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void createNewUsers(List<User> userList){
        try(Session session = connector.getSession()){
            session.beginTransaction();
            userList.forEach(session::save);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateUserByID(int id){
        try(Session session = connector.getSession()){
            String hql = "FROM User WHERE id = :id";
            Query<User> userQuery = session.createQuery(hql, User.class);
            userQuery.setParameter("id", id);
            User user = userQuery.getSingleResult();
            session.beginTransaction();

            System.out.print("Выберите поле для редактирования:\n" +
                    "1 - Имя\n" +
                    "2 - Фамилия\n" +
                    "3 - Отчество\n" +
                    "4 - Возраст\n" +
                    "5 - Группа пользователя\n" +
                    "6 - Активность пользователя\n" +
                    "7 - Дата ближайшей сессии\n" +
                    "8 - Статус оплаты\n" +
                    "");
            String inputChoice = new Scanner(System.in).next();

            switch (inputChoice){
                case "1":
                    new UpdateFirstName().upd(user, session);
                    break;
                case "2":
                    //
                    break;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
