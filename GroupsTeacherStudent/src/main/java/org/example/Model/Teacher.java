package org.example.Model;

import java.util.Date;
import java.util.List;

public class Teacher extends User {
    int exp;
    static int count = 0;
    List<Integer> group;
    final int ID;
    public Teacher(String fio, Date dateBirth) {
        super(fio, dateBirth);
        ID = count++;
    }


    @Override
    public String toString() {
        return "Teacher{" +
                "group=" + StudyGroup.ID +
                ", ID=" + ID +
                ", fio='" + fio + '\'' +
                ", dateBirth=" + dateBirth +
                '}';
    }
}
