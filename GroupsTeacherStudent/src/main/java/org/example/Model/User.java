package org.example.Model;

import java.util.Date;

public abstract class User {
    int ID;
    String fio;
    Date dateBirth;

    public User(int ID, String fio, Date dateBirth) {
        this.ID = ID;
        this.fio = fio;
        this.dateBirth = dateBirth;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "ID=" + ID +
                ", fio='" + fio + '\'' +
                ", dateBirth=" + dateBirth +
                '}';
    }
}
