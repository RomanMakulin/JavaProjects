package org.example.Model.Interface;

import org.example.Model.User.Teacher;
import org.example.Model.User.Student;

public class UserService implements DataServiceUser {

    @Override
    public Student create(Student student) {
        return student;
    }

    @Override
    public Teacher create(Teacher teacher) {
        return teacher;
    }
}
