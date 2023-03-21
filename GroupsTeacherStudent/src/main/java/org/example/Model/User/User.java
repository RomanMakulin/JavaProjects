package org.example.Model.User;

import java.util.Date;

public abstract class User {
    private static int counterID;
    private int id;
    private String fio;
    private Date dateBirth;

    public User(String fio, Date dateBirth) {
        this.fio = fio;
        this.dateBirth = dateBirth;
        counterID += 1;
        id = counterID;
    }

    public static int getCounterID() {
        return counterID;
    }

    public static void setCounterID(int counterID) {
        User.counterID = counterID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "User{" +
                "ID=" + id +
                ", fio='" + fio + '\'' +
                ", dateBirth=" + dateBirth +
                '}';
    }


}
