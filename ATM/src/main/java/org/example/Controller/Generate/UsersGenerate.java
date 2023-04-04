package org.example.Controller.Generate;

import org.example.Model.Interfaces.GenerateService;
import org.example.Model.User;

import java.util.ArrayList;
import java.util.List;

public class UsersGenerate<T> implements GenerateService {
    @Override
    public List<?> service() {
        List<User> userList = new ArrayList<>();
        userList.add(new User("roma", 123, 0, 1000));
        userList.add(new User("ann", 321, 0, 1000));
        userList.add(new User("olga", 111, 0, 1000));
        return userList;
    }
}
