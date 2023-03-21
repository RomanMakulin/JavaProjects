package org.example.View;

import org.example.Model.Interface.StudyGroupService;
import org.example.Model.Interface.UserService;
import org.example.Model.StudGroup.StudyGroup;
import org.example.Model.User.Student;
import org.example.Model.User.Teacher;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class GenerateGroup {
    public StudyGroup groupGenerate(UserService userService, Scanner scanner, List<Student> students) {
        System.out.println("Введите имя учителя: ");
        StudyGroup group = new StudyGroupService().createGroup(userService.create(new Teacher(scanner.nextLine(), new Date())), students);
        return group;
    }
}
