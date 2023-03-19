package org.example.Model;

import java.util.Date;
import java.util.List;

public class Student extends User {
    int groupId;
    List<Integer> grade;

    public Student(String fio, Date dateBirth) {
        super(fio, dateBirth);
    }

    @Override
    public String toString() {
        return "Student{" +
                "grade=" + grade +
                ", ID=" + ID +
                ", fio='" + fio + '\'' +
                ", dateBirth=" + dateBirth +
                '}';
    }
}
