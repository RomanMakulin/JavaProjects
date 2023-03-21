package org.example.View;

import org.example.Model.Interface.UserService;
import org.example.Model.User.Student;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class GenerateStudents {

    public void generateStudents(int groupValue, List<Student> students, UserService userService, Scanner scanner) {
        for (int i = 0; i < groupValue; i++) {
            System.out.printf("Введите имя студента #%d: \n", i);
            students.add(userService.create(new Student(scanner.nextLine(), new Date())));
        }
    }
}
