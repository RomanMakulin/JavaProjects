package org.example.Controller.Actions;

import org.example.Controller.FileWork.Notes.CreateFile;
import org.example.Controller.FileWork.Users.SaveUser;
import org.example.Model.Interfaces.UserService;
import org.example.Model.User;
import org.example.View.Error;

import java.util.List;

public class Registration implements UserService {
    @Override
    public void service(List<User> userList) {
        User user = new User();

        for (int i = 0; i < userList.size(); i++) {
            if (userList.get(i).getName().equals(user.getName())) {
                new Error().service();
                System.exit(1);
            }
        }

        userList.add(user);
        new SaveUser().save(userList);
        new CreateFile().create(user.getName());

    }
}
