package org.example.Model;

import java.util.List;

public class StudyGroup {
    public User teacher;
    public List<User> students;
    static int ID;

    public StudyGroup(User teacher, List<User> students) {
        this.teacher = teacher;
        this.students = students;
        ID++;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < students.size(); i++) {
            str.append(students.get(i) + "\n");
        }
        return String.format("Group #%d: \n%s\n%s",ID, teacher, str);

    }
}
