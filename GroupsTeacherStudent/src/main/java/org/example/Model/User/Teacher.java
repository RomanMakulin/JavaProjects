package org.example.Model.User;

import org.example.Model.StudGroup.StudyGroup;
import java.util.Date;

public class Teacher extends User {
    public Teacher(String fio, Date dateBirth) {
        super(fio, dateBirth);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "group=" + StudyGroup.getCounterID() +
                ", ID=" + getId() +
                ", fio='" + getFio() + '\'' +
                ", dateBirth=" + getDateBirth() +
                '}';
    }
}
