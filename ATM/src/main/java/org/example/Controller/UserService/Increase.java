package org.example.Controller.UserService;

import org.example.Model.Interfaces.UserService;
import org.example.Model.User;
import org.example.View.Input;

public class Increase implements UserService {
    @Override
    public void service(User user) {
        int increase = new Input().integer("Введите сумму: ");
        if (user.getCash() >= increase) {
            user.setMoney(user.getMoney() + increase);
            user.setCash(user.getCash() - increase);
        } else System.out.println("Недостаточно средств для пополнения!");
    }
}
