package org.example.Controller.UserService;

import org.example.Model.Interfaces.UserService;
import org.example.Model.User;
import org.example.View.Input.InputPin;
import org.example.View.Print.WrongInput;

public class InfoUser implements UserService {
    @Override
    public void service(User user) {
        if (new InputPin().input() == user.getPin()) {
            System.out.println(user);
        } else{
            new WrongInput().print();
            System.exit(1);
        }
    }
}
