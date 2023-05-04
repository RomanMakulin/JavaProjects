package org.example.Controller.UserService;

import org.example.Model.Interfaces.UserService;
import org.example.Model.User;
import org.example.View.Input.InputNewPin;
import org.example.View.Input.InputPin;
import org.example.View.Print.WrongInput;

public class NewPin implements UserService {
    @Override
    public void service(User user) {
        int tryPin = new InputPin().input();
        if (tryPin == user.getPin()) user.setPin(new InputNewPin().input());
        else{
            new WrongInput().print();
            System.exit(1);
        }
    }
}
