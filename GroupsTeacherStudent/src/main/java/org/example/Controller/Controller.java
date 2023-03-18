package org.example.Controller;

import org.example.Model.Student;
import org.example.Model.Teacher;
import org.example.Model.User;
import org.example.Model.UserService;
import org.example.View.View;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    public static void main(String[] args) {
        UserService userService = new UserService();
        View view = new View();

        List<User> users = new ArrayList<>();
        users.add(userService.create(new Student()));
        users.add(userService.create(new Teacher()));

        System.out.println(view.studentView(users));

    }
}
