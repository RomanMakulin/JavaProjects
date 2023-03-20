package org.example.View;

import org.example.Model.*;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class View<T> {
    public String usersView(List<T> users){
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < users.size(); i++) {
            str.append(users.get(i) + "\n");
        }
        return str.toString();
    }

    public void generateStudents(int groupValue, List<Student> students, UserService userService, Scanner scanner) {
        groupValue = 4;
        for (int i = 0; i < groupValue; i++) {
            System.out.printf("Введите имя студента #%d: \n", i);
            students.add(userService.create(new Student(scanner.nextLine(), new Date())));
        }
    }

    public StudyGroup groupGenerate(UserService userService, Scanner scanner, List<Student> students) {
        System.out.println("Введите имя учителя: ");
        StudyGroup group = new StudyGroupService().createGroup(userService.create(new Teacher(scanner.nextLine(), new Date())), students);
        return group;
    }

}
