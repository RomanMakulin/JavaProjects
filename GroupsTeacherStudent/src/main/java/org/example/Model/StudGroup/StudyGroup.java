package org.example.Model.StudGroup;

import org.example.Model.User.User;
import java.util.List;

public class StudyGroup {
    private User teacher;
    private List<User> students;
    private static int counterID;
    private int id;

    public StudyGroup(User teacher, List<User> students) {
        this.teacher = teacher;
        this.students = students;
        counterID += 1;
        id = counterID;
    }

    public static int getCounterID() {
        return counterID;
    }

    public static void setCounterID(int counterID) {
        StudyGroup.counterID = counterID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < students.size(); i++) {
            str.append(students.get(i) + "\n");
        }
        return String.format("Group #%d: \n%s\n%s",getId(), teacher, str);

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

}
