package org.example.Model;

import org.example.Model.DataService;
import org.example.Model.Student;
import org.example.Model.Teacher;
import org.example.Model.User;

import java.util.Date;
import java.util.List;

public class UserService implements DataService {

    @Override
    public User create(Student student) {
        return new Student(1, "Roman Makulin", new Date());
    }

    @Override
    public User create(Teacher teacher) {
        return new Teacher(1, "Olga Makulina", new Date());
    }

    @Override
    public List<User> read(List<User> users) {
        return users;
    }

}
