package org.example.Controller;

import org.example.Model.StudGroup.StudyGroup;
import org.example.Model.Interface.UserService;
import org.example.View.GetInf;
import org.example.View.View;
import org.example.Model.User.Student;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Controller {
    public StudyGroup buttonClick(int maxGroupValue) {

        GenerateStudents generateS = new GenerateStudents();
        GenerateGroup generateG = new GenerateGroup();
        List<Student> students = new ArrayList<>();

        generateS.generateStudents(maxGroupValue, students, new UserService(), new GetInf());
        StudyGroup group = generateG.groupGenerate(new UserService(), students, new GetInf());

        System.out.println(new View().usersView(Arrays.asList(group)));
        return group;
    }

}
