package org.example.Controller;

import org.example.Model.Interface.UserService;
import org.example.Model.User.Student;
import org.example.View.GetInf;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class GenerateStudents {

    public void generateStudents(int groupValue, List<Student> students, UserService userService, Scanner scanner, GetInf input) {
        for (int i = 0; i < groupValue; i++) {
            students.add(userService.create(new Student(input.inputName(scanner, String.format("Введите имя студента #%d", i)), new Date())));
        }
    }
}
