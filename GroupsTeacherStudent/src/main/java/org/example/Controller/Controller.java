package org.example.Controller;

import org.example.Model.StudGroup.StudyGroup;
import org.example.Model.Interface.UserService;
import org.example.View.GetInf;
import org.example.Model.User.Student;
import java.util.ArrayList;
import java.util.List;


public class Controller {
    public StudyGroup buttonClick(int maxGroupValue) {
        List<Student> students = new ArrayList<>();
        new GenerateStudents().generateStudents(maxGroupValue, students, new UserService(), new GetInf());
        return new GenerateGroup().groupGenerate(new UserService(), students, new GetInf());
    }
}
