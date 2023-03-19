package org.example.Model;

import java.util.List;

public class StudyGroup {
    public Teacher teacher;
    public List<Student> students;

    public StudyGroup(Teacher teacher, List<Student> students) {
        this.teacher = teacher;
        this.students = students;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < students.size(); i++) {
            str.append(students.get(i) + "\n");
        }
        return String.format("Group: \n%s\n%s", teacher, str);

    }
}
