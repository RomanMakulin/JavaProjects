package org.example.Controller.UserService;

import org.example.Model.Interfaces.UserService;
import org.example.Model.User;
import org.example.View.Input;

public class NewPin implements UserService {
    @Override
    public void service(User user) {
        int tryPin = new Input().integer("PIN: ");
        if (tryPin == user.getPin()) user.setPin(new Input().integer("New PIN: "));
    }
}
