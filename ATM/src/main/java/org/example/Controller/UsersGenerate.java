package org.example.Controller;

import org.example.Model.Interfaces.AtmService;
import org.example.Model.User;

import java.util.List;

public class UsersGenerate{
    public void service(List<User> userList) {
        userList.add(new User("roma", 123, 0, 1000));
        userList.add(new User("ann", 321, 0, 1000));
        userList.add(new User("olga", 111, 0, 1000));
    }
}
