package org.example.Controller;

import org.example.Controller.Generate.AtmGenerate;
import org.example.Controller.Generate.ReadUsers;
import org.example.Model.ATM;
import org.example.Model.AtmStatus;
import org.example.Model.User;
import org.example.View.*;
import org.example.View.Print.LoginSystem;
import org.example.View.Print.NotWorkingAtm;
import org.example.View.Print.WrongInput;

import java.util.List;

public class Controller {
    public void buttonClick() {

        List<User> userList = new ReadUsers().read();
        List<ATM> atmList = new AtmGenerate().service();

        new AtmSettings().service(atmList);
        new AtmShow().print(atmList);
        new Login().log(atmList, userList);

    }
}
