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
        users.add(userService.create(new Student("Roman Makulin", new Date())));
        users.add(userService.create(new Student("Ann Novikova", new Date())));
        users.add(userService.create(new Teacher("Milka Makulina", new Date())));
        users.add(userService.create(new Teacher("Vika Krasnova", new Date())));

        System.out.println(view.usersView(users));

//        List<Student> students = new ArrayList<>();
//
//        students.add(userService.create(new Student("Roman Makulin", new Date())));
//        students.add(userService.create(new Student("Ann Novikova", new Date())));
//        students.add(userService.create(new Student("Milka Makulina", new Date())));
//        students.add(userService.create(new Student("Vika Krasnova", new Date())));
//
//
//        StudyGroup group1 = new StudyGroupService().createGroup(
//                userService.create(new Teacher("Olga Alexandrovna", new Date())),
//                students);
//
//        System.out.println(view.usersView(Arrays.asList(group1)));
//
//
//        List<Student> students2 = new ArrayList<>();
//
//        students2.add(userService.create(new Student("Roman Makulin", new Date())));
//        students2.add(userService.create(new Student("Ann Novikova", new Date())));
//        students2.add(userService.create(new Student("Milka Makulina", new Date())));
//        students2.add(userService.create(new Student("Vika Krasnova", new Date())));
//
//
//        StudyGroup group2 = new StudyGroupService().createGroup(
//                userService.create(new Teacher("Olga Alexandrovna", new Date())),
//                students2);
//
//        System.out.println(view.usersView(Arrays.asList(group2)));

    }
}
