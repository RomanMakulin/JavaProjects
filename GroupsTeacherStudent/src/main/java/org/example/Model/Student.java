package org.example.Model;

import java.util.Date;
import java.util.List;

public class Student extends User {
    int groupId;
    static int count = 0;
    List<Integer> grade;
    final int ID;
    public Student(String fio, Date dateBirth) {
        super(fio, dateBirth);
        ID = count++;
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
