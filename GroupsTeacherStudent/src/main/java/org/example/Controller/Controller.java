package org.example.Controller;

import org.example.Model.StudGroup.StudyGroup;
import org.example.Model.Interface.UserService;
import org.example.View.GenerateGroup;
import org.example.View.View;
import org.example.View.GenerateStudents;
import org.example.Model.User.Student;

import java.util.*;

public class Controller {
    public StudyGroup buttonClick(int maxGroupValue) {

        GenerateStudents generateS = new GenerateStudents();
        GenerateGroup generateG = new GenerateGroup();
        View view = new View();
        List<Student> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);


        generateS.generateStudents(maxGroupValue, students, new UserService(), scanner);
        StudyGroup group = generateG.groupGenerate(new UserService(), scanner, students);

        System.out.println(view.usersView(Arrays.asList(group)));
        return group;
    }

}
