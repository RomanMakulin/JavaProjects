package org.example.example.version.Controller;
import org.example.example.version.Model.User.User;
import org.example.example.version.VIew.InputStr;

public class Registration {
    User user;
    public User newUser(){
        String login = new InputStr().input("Придумайте логин: ");
        String password = new InputStr().input("Придумайте пароль: ");
        if (password.equals(new InputStr().input("Повторите пароль: "))) {
            user = new User(login, password);
        }
        return user;
    }
}
