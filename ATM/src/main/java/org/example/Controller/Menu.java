package org.example.Controller;

import org.example.Controller.Generate.UpdateUsers;
import org.example.Controller.UserService.Decrease;
import org.example.Controller.UserService.Increase;
import org.example.Controller.UserService.InfoUser;
import org.example.Controller.UserService.NewPin;
import org.example.Model.User;
import org.example.View.Input.InputCmd;
import org.example.View.Print.MoneyInfo;
import org.example.View.Print.SystemExit;
import org.example.View.ViewMenu;
import java.util.List;

public class Menu {
    public void service(User user, List<User> userList) {
        while (true) {
            new ViewMenu().menu();

            switch (new InputCmd().input()) {

                case "1":
                    new Decrease().service(user);
                    break;

                case "2":
                    new Increase().service(user);
                    break;

                case "3":
                    new NewPin().service(user);
                    break;

                case "4":
                    //
                    break;

                case "5":
                    new MoneyInfo().service(user);
                    break;

                case "6":
                    new InfoUser().service(user);
                    break;

                case "7":
                    new SystemExit().print();
                    System.exit(1);
                    break;
            }
            new UpdateUsers().upd(userList); // save users in file
        }
    }
}
