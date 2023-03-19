package org.example.Controller;

import org.example.Model.*;
import org.example.View.View;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Controller {
    public static void main(String[] args) {
        UserService userService = new UserService();
        View view = new View();


        List<User> users = new ArrayList<>();

        users.add(userService.create(new Student("Roman", new Date())));
        users.add(userService.create(new Student("Vasya", new Date())));
        users.add(userService.create(new Student("Igor", new Date())));
        users.add(userService.create(new Teacher("Olga", new Date())));

        System.out.println(view.usersView(users));




    }
}
