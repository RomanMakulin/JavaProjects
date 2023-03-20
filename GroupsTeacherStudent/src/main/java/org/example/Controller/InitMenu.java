package org.example.Controller;

import org.example.Model.Student;
import org.example.Model.StudyGroup;
import org.example.Model.UserService;
import org.example.View.View;

import java.util.*;

public class InitMenu {
    public StudyGroup buttonClick(int maxGroupValue) {

        UserService userService = new UserService();
        View view = new View();
        List<Student> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        view.generateStudents(maxGroupValue, students, userService, scanner);
        StudyGroup group = view.groupGenerate(userService, scanner, students);

        System.out.println(view.usersView(Arrays.asList(group)));
        return group;

    }

}
