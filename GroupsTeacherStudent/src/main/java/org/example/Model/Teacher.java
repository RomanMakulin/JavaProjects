package org.example.Model;

import java.util.Date;
import java.util.List;

public class Teacher extends User {
    int exp;
    List<Integer> group;
    public Teacher(String fio, Date dateBirth) {
        super(fio, dateBirth);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "group=" + StudyGroup.ID +
                ", ID=" + id +
                ", fio='" + fio + '\'' +
                ", dateBirth=" + dateBirth +
                '}';
    }
}
