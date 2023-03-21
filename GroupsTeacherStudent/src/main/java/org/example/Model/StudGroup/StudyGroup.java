package org.example.Model.StudGroup;

import org.example.Model.User.User;

import java.util.List;

public class StudyGroup {
    private User teacher;
    private List<User> students;
    private static int ID;

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

    public User getTeacher() {
        return teacher;
    }

    public void setTeacher(User teacher) {
        this.teacher = teacher;
    }

    public List<User> getStudents() {
        return students;
    }

    public void setStudents(List<User> students) {
        this.students = students;
    }

    public static int getID() {
        return ID;
    }

    public static void setID(int ID) {
        StudyGroup.ID = ID;
    }
}
