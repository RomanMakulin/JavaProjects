package org.example.Controller;

import org.example.Controller.UserService.Decrease;
import org.example.Controller.UserService.Increase;
import org.example.Controller.UserService.InfoUser;
import org.example.Controller.UserService.NewPin;
import org.example.Model.User;
import org.example.View.Input;
import org.example.View.ViewMenu;

public class Controller {
    public void buttonClick() {

        User user = new User("roma", 123, 0, 1000);
        User user2 = new User("ann", 321, 0, 1000);

        if (new Login().log(user2)) new Menu().service(user2);
        else System.out.println("Wrong login/pin");
    }
}
