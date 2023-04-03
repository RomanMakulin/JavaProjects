package org.example.Controller;

import org.example.Model.ATM;
import org.example.Model.AtmStatus;
import org.example.Model.User;
import org.example.View.Input;

public class Login {
    boolean log(User user, ATM atm){
        System.out.println("Вход в систему");
        if (!atm.getAtmStatus().equals(AtmStatus.ON)){
            System.out.println("Банкомат не работает, выберите другой!");
            return false;
        }
        return user.getLogin().equals(new Input().string("Login: ")) && user.getPin() == new Input().integer("Pin: ");
    }
}
