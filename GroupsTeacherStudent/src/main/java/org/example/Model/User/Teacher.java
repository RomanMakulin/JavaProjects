package org.example.Model.User;

import org.example.Model.StudGroup.StudyGroup;
import org.example.Model.User.User;

import java.util.Date;

public class Teacher extends User {
    public Teacher(String fio, Date dateBirth) {
        super(fio, dateBirth);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "group=" + StudyGroup.getID() +
                ", ID=" + getId() +
                ", fio='" + getFio() + '\'' +
                ", dateBirth=" + getDateBirth() +
                '}';
    }
}
