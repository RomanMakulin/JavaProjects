package org.example.Controller;

import org.example.Controller.Generate.AtmGenerate;
import org.example.Controller.Generate.ReadUsers;
import org.example.Controller.Generate.UpdateUsers;
import org.example.Model.ATM;
import org.example.Model.User;
import org.example.View.AtmShow;
import org.example.View.Input;
import org.example.View.Print.WrongInput;
import java.util.List;

public class Controller {
    public void buttonClick() {

        List<User> userList = new ReadUsers().read();
        List<ATM> atmList = new AtmGenerate().service();

        new AtmSettings().service(atmList);
        new AtmShow().print(atmList);

        int cardNum = new Input().integer("Введите уникальный номер карты: ");


        if (new Login().log(userList.get(cardNum), atmList.get(new Input().integer("Введите номер банкомата: ")))){
            new Menu().service(userList.get(cardNum), userList);
        } else new WrongInput().print();

    }
}
