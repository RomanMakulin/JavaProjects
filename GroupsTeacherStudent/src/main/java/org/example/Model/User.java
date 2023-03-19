package org.example.Model;

import java.util.Date;

public abstract class User {
    static int ID = 0;
    String fio;
    Date dateBirth;

    public User(String fio, Date dateBirth) {
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
