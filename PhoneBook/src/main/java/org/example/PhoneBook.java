package org.example;

public class PhoneBook {
    protected int id;
    protected String name;
    protected long phoneNumber;
    protected int salary;
    protected String comment;

    public PhoneBook(int id, String name, long phoneNumber, int salary, String comment) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "ID: " + id +
                ", Name: " + name +
                ", phoneNumber: " + phoneNumber +
                ", salary: " + salary +
                ", comment: " + comment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
