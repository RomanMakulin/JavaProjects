package org.example.Controller.Actions;

import org.example.Controller.Menu.UserSwitch;
import org.example.Model.Interfaces.UserService;
import org.example.Model.User;
import org.example.View.Error;
import org.example.View.Input.InputLogin;
import org.example.View.Input.InputPassword;

import java.util.List;

public class Login implements UserService {
    @Override
    public void service(List<User> userList) {
        String login = new InputLogin().print();
        String password = new InputPassword().print();

        for (int i = 0; i < userList.size(); i++) {
            if (userList.get(i).getName().equals(login)) {
                if (userList.get(i).getPassword().equals(password)) new UserSwitch().menu(userList.get(i));
            }
        }

    }
}
