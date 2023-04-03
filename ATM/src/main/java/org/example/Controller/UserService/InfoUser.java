package org.example.Controller.UserService;

import org.example.Model.Interfaces.UserService;
import org.example.Model.User;
import org.example.View.Input;

public class InfoUser implements UserService {
    @Override
    public void service(User user) {
        if (new Input().integer("PIN: ") == user.getPin()) {
            System.out.println(user);
        } else System.out.println("Ошибка ввода pin");
    }
}
