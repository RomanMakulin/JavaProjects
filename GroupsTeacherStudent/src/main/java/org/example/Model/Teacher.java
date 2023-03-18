package org.example.Model;

import java.util.Date;
import java.util.List;

public class Teacher extends User {
    int exp;
    List<Integer> group;

    public Teacher(int ID, String fio, Date dateBirth) {
        super(ID, fio, dateBirth);
    }

    public Teacher() {
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "group=" + group +
                ", ID=" + ID +
                ", fio='" + fio + '\'' +
                ", dateBirth=" + dateBirth +
                '}';
    }
}
