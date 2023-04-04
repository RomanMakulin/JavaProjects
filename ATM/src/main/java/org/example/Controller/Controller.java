package org.example.Controller;

import org.example.Controller.Generate.AtmGenerate;
import org.example.Controller.Generate.UsersGenerate;
import org.example.Model.ATM;
import org.example.Model.User;
import org.example.View.AtmShow;
import org.example.View.Input;
import org.example.View.Print.WrongInput;
import java.util.ArrayList;
import java.util.List;

public class Controller {
    public void buttonClick() {

        List<User> userList = new UsersGenerate().service();
        List<ATM> atmList = new AtmGenerate().service();

        new AtmSettings().service(atmList);
        new AtmShow().print(atmList);

        User needUser = userList.get(new Input().integer("Введите уникальный номер карты: "));

        if (new Login().log(needUser, atmList.get(new Input().integer("Введите номер банкомата: ")))){
            new Menu().service(needUser);
        } else new WrongInput().print();

    }
}
