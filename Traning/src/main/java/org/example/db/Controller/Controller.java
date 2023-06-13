package org.example.db.Controller;

import org.example.db.Controller.DB.Tasks.ReadAllUsers;
import org.example.db.Controller.DB.Tasks.SignUpUser;
import org.example.db.Model.User;
import org.example.db.View.Menu;
import org.example.db.View.showUsers;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    public void startButton() {

        boolean finish = false;

        while (finish == false) {
            switch (new Menu().show()) {

                case "1":
                    User user = new User();
                    new SignUpUser().signUpUser(user);
                    break;
                case "2":
                    List<User> users = new ArrayList<>();
                    new ReadAllUsers().readUsers(users);
                    new showUsers().print(users);
                    break;
                case "3":
                    finish = true;
                    break;

            }
        }

    }
}
