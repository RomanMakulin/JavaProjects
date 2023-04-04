package org.example.Controller.UserService;

import org.example.Model.Interfaces.UserService;
import org.example.Model.User;
import org.example.View.Input;
import org.example.View.Print.NotEnoughMoney;

public class Decrease implements UserService {
    @Override
    public void service(User user) {
        int decrease = new Input().integer("Введите сумму: ");
        if (user.getMoney() >= decrease) {
            user.setMoney(user.getMoney() - decrease);
            user.setCash(user.getCash() + decrease);
        } else new NotEnoughMoney().print();
    }
}
