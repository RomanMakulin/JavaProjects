package org.example.Controller;

import org.example.Model.*;
import org.example.View.View;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Controller {
    public static void main(String[] args) {
        UserService userService = new UserService();
        View view = new View();


        List<User> users = new ArrayList<>();
        List<Student> students = new ArrayList<>();

        List<StudyGroup> group = new ArrayList<>();

        Teacher teacher1 = new Teacher("11", new Date());

        List<Student> studs = Arrays.asList(new Student("11", new Date()), new Student("15", new Date()));


        for (int i = 0; i < studs.size(); i++) {
            System.out.println(studs.get(i));
        }
        group.add(teacher1, studs);

//
//        users.add(userService.create(new Student("Roman", new Date())));
//        users.add(userService.create(new Student("Vasya", new Date())));
//        users.add(userService.create(new Student("Igor", new Date())));
//        users.add(userService.create(new Teacher("Olga", new Date())));
//
//        System.out.println(view.usersView(users));






    }
}
