package org.example.Model;

import java.util.Date;

public abstract class User {
    static int counterID;
    int id;
    String fio;
    Date dateBirth;

    public User(String fio, Date dateBirth) {
        this.fio = fio;
        this.dateBirth = dateBirth;
        counterID += 1;
        id = counterID;
    }

    @Override
    public String toString() {
        return "User{" +
                "ID=" + id +
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
