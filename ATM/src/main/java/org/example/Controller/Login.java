package org.example.Controller;

import org.example.Model.User;
import org.example.View.Input;

public class Login {
    boolean log(User user){
        System.out.println("Вход в систему");
        return user.getLogin().equals(new Input().string("Login: ")) && user.getPin() == new Input().integer("Pin: ");
    }
}
