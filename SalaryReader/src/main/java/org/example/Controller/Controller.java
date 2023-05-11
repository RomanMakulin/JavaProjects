package org.example.Controller;

import org.example.Controller.FileWork.Users.UsersRead;
import org.example.Controller.Menu.LoginSwitch;

public class Controller {
    public void buttonClick() {

        new LoginSwitch().service(new UsersRead().read());

    }
}
