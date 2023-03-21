package org.example.Controller;

import org.example.Model.Interface.UserService;
import org.example.Model.User.Student;
import org.example.View.GetInf;
import java.util.Date;
import java.util.List;

public class GenerateStudents {

    public void generateStudents(int groupValue, List<Student> students, UserService userService, GetInf input) {
        for (int i = 0; i < groupValue; i++) {
            students.add(userService.create(new Student(input.inputName(String.format("Введите имя студента #%d", i)), new Date())));
        }
    }
}
