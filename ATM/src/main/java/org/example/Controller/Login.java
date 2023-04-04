package org.example.Controller;

import org.example.Model.ATM;
import org.example.Model.AtmStatus;
import org.example.Model.User;
import org.example.View.Input;
import org.example.View.Print.LoginSystem;
import org.example.View.Print.NotWorkingAtm;

public class Login {
    boolean log(User user, ATM atm){
        new LoginSystem().print();
        if (!atm.getAtmStatus().equals(AtmStatus.ON)){
            new NotWorkingAtm().print();
            return false;
        }
        return user.getLogin().equals(new Input().string("Login: ")) && user.getPin() == new Input().integer("Pin: ");
    }
}
