package org.example.Model;

import java.util.List;

public class StudyGroup {
    Teacher teacher;
    List<Student> students;

    public StudyGroup(Teacher teacher, List<Student> students) {
        this.teacher = teacher;
        this.students = students;
    }
}
