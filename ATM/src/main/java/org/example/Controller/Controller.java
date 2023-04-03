package org.example.Controller;

import org.example.Model.ATM;
import org.example.Model.User;
import org.example.View.AtmShow;
import org.example.View.Input;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    public void buttonClick() {

//        User user = new User("roma", 123, 0, 1000);
//        User user2 = new User("ann", 321, 0, 1000);

        List<User> userList = new ArrayList<>();
//        userList.add(new User("roma", 123, 0, 1000));
//        userList.add(new User("ann", 321, 0, 1000));
//        userList.add(new User("olga", 111, 0, 1000));
        new UsersGenerate().service(userList);

        List<ATM> atmList = new ArrayList<>();
        new AtmGenerate().service(atmList);
        new AtmSettings().service(atmList);
        new AtmShow().print(atmList);

        User needUser = userList.get(new Input().integer("Введите уникальный номер карты: "));

        if (new Login().log(needUser, atmList.get(new Input().integer("Введите номер банкомата: ")))){
            new Menu().service(needUser);
        } else System.out.println("Wrong login/pin");

    }
}
