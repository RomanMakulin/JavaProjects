package org.example.Controller;

import org.example.Model.StudGroup.StudyGroup;
import org.example.Model.Interface.UserService;
import org.example.View.GetInf;
import org.example.Model.User.Student;
import java.util.ArrayList;
import java.util.List;

public class Controller {
    public StudyGroup completeGroup(GetInf input) {
        List<Student> students = new ArrayList<>();

        new GenerateStudents().generateStudents(
                Integer.parseInt(input.inputName("Введите кол-во студентов в группе: ")),
                students, new UserService(), new GetInf());

        return new GenerateGroup().groupGenerate(new UserService(), students, new GetInf());
    }
}
