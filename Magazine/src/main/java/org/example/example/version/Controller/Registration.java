package org.example.example.version.Controller;
import org.example.example.version.Model.User.User;
import org.example.example.version.View.*;

public class Registration {
    User user;
    public User newUser(){
        new RegistrationInfo().show();

        String login = new LoginInput().input();
        String password = new PasswordInput().input();

        if (password.equals(new RepeatPassword().input())) user = new User(login, password);
        else new ErrorPassword().show();

        return user;
    }
}
