package org.example.example.version.Controller;

import org.example.example.version.Model.User.User;
import org.example.example.version.VIew.InputStr;

public class Login {
    boolean tryLog(User user){
        return user.getName().equals(new InputStr().input("Login: "))
                && user.getPassword().equals(new InputStr().input("Введите пароль: "));
    }
}
