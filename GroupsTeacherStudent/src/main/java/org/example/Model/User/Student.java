package org.example.Model.User;

import java.util.Date;
import java.util.List;

public class Student extends User {
    private List<Integer> grade;
    public Student(String fio, Date dateBirth) {
        super(fio, dateBirth);
    }

    @Override
    public String toString() {
        return "Student{" +
                "grade=" + grade +
                ", ID=" + getId() +
                ", fio='" + getFio() + '\'' +
                ", dateBirth=" + getDateBirth() +
                '}';
    }
}
