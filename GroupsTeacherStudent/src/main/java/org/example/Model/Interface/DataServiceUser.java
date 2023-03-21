package org.example.Model.Interface;

import org.example.Model.User.Teacher;
import org.example.Model.User.Student;

public interface DataServiceUser {
    Student create(Student student);
    Teacher create(Teacher teacher);
}
