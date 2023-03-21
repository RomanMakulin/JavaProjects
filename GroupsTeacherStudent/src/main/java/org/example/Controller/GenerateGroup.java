package org.example.Controller;

import org.example.Model.Interface.StudyGroupService;
import org.example.Model.Interface.UserService;
import org.example.Model.StudGroup.StudyGroup;
import org.example.Model.User.Student;
import org.example.Model.User.Teacher;
import org.example.View.GetInf;
import java.util.Date;
import java.util.List;

public class GenerateGroup {
    public StudyGroup groupGenerate(UserService userService, List<Student> students, GetInf input) {
        StudyGroup group = new StudyGroupService().createGroup(userService.create(
                new Teacher(input.inputName("Введите имя учителя:"), new Date())), students);
        return group;
    }
}
