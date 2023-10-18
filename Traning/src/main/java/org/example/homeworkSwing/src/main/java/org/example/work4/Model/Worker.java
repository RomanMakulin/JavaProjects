package org.example.work4.Model;

public class Worker {
    protected int id;
    static int ID = 0;
    protected String phoneNumber;
    protected String name;
    protected int stage;

    public Worker(String phoneNumber, String name, int stage) {
        this.id = ++ID;
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.stage = stage;
    }

    public int getId() {
        return id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStage() {
        return stage;
    }

    public void setStage(int stage) {
        this.stage = stage;
    }

    @Override
    public String toString() {
        return  "id = " + id +
                ", phoneNumber = " + phoneNumber + ", name = " + name + ", stage = " + stage;
    }
}
