package org.example.Controller.Menu;

import org.example.Controller.Actions.Login;
import org.example.Controller.Actions.Registration;
import org.example.Controller.FileWork.Users.SaveUser;
import org.example.Model.Interfaces.UserService;
import org.example.Model.User;
import org.example.View.LoginRegistration;

import java.util.List;

public class LoginSwitch implements UserService {
    @Override
    public void service(List<User> userList) {
        while (true) {
            switch (new LoginRegistration().print()) {

                case "1":
                    new Login().service(userList);
                    break;

                case "2":
                    new Registration().service(userList);
                    break;

            }
        }
    }
}
