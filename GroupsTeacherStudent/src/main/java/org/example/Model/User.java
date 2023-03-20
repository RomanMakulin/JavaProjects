package org.example.Model;

import java.util.Date;

public abstract class User {
    final int ID;
    static int count = 0;
    String fio;
    Date dateBirth;

    public User(String fio, Date dateBirth) {
        this.fio = fio;
        this.dateBirth = dateBirth;
        ID = count;
    }


    @Override
    public String toString() {
        return "User{" +
                "ID=" + ID +
                ", fio='" + fio + '\'' +
                ", dateBirth=" + dateBirth +
                '}';
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public Date getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(Date dateBirth) {
        this.dateBirth = dateBirth;
    }
}
