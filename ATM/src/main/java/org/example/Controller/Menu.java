package org.example.Controller;

import org.example.Controller.UserService.Decrease;
import org.example.Controller.UserService.Increase;
import org.example.Controller.UserService.InfoUser;
import org.example.Controller.UserService.NewPin;
import org.example.Model.Interfaces.UserService;
import org.example.Model.User;
import org.example.View.Input;
import org.example.View.ViewMenu;

public class Menu implements UserService {
    @Override
    public void service(User user) {
        while (true) {
            new ViewMenu().menu();

            switch (new Input().string("cmd: ")) {

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
                    System.out.printf("Денюшки: %d", user.getMoney());
                    break;

                case "6":
                    new InfoUser().service(user);
                    break;

                case "7":
                    System.out.println("Bye");
                    System.exit(1);
                    break;
            }
        }
    }
}
