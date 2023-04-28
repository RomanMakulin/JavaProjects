package org.example.example.version.Controller;
import org.example.example.version.Model.User.User;
import org.example.example.version.View.InputStr;

public class Registration {
    User user;
    public User newUser(){
        System.out.println("Регистрация:");
        String login = new InputStr().input("Придумайте логин: ");
        String password = new InputStr().input("Придумайте пароль: ");
        if (password.equals(new InputStr().input("Повторите пароль: "))) {
            user = new User(login, password);
            System.out.println();
        }else{
            System.out.println("Ошибка при повторении пароля!");
            System.exit(1);
        }
        return user;
    }
}
