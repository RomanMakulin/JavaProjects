package org.example.Model;

import java.util.Date;
import java.util.List;

public class Student extends User {
    List<Integer> grade;
    public Student(String fio, Date dateBirth) {
        super(fio, dateBirth);
    }

    @Override
    public String toString() {
        return "Student{" +
                "grade=" + grade +
                ", ID=" + id +
                ", fio='" + fio + '\'' +
                ", dateBirth=" + dateBirth +
                '}';
    }
}
