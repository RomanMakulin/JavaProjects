package org.example.DataBase.UpdateUser;

import org.example.Model.User;
import org.hibernate.Session;

import java.util.Scanner;

public class UpdateFirstName {
    public void upd (User user, Session session){
        System.out.print("Введите новое имя пользователя: ");
        String newName = new Scanner(System.in).next();
        user.setFirstName(newName);
        session.update(user);
        session.getTransaction().commit();
    }
}
