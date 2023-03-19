package org.example.Model;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class UserService implements DataService {

    @Override
    public User create(Student student) {
        return student;
    }

    @Override
    public User create(Teacher teacher) {
        return teacher;
    }

}
