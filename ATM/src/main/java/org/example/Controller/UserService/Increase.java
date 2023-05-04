package org.example.Controller.UserService;

import org.example.Model.Interfaces.UserService;
import org.example.Model.User;
import org.example.View.Input.InputCountMoney;
import org.example.View.Print.NotEnoughMoney;

public class Increase implements UserService {
    @Override
    public void service(User user) {
        int increase = new InputCountMoney().input();
        if (user.getCash() >= increase) {
            user.setMoney(user.getMoney() + increase);
            user.setCash(user.getCash() - increase);
        } else new NotEnoughMoney().print();
    }
}
