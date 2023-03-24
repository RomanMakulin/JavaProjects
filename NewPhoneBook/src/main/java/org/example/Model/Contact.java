package org.example.Model;

public class Contact {
    private int id;
    private static int counterId;
    private String name;
    private long phoneNumber;
    private int salary;
    private String comment;

    public Contact(String name, long phoneNumber, int salary, String comment) {
        counterId += 1;
        this.id = counterId;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.comment = comment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getCounterId() {
        return counterId;
    }

    public static void setCounterId(int counterId) {
        Contact.counterId = counterId;
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

    @Override
    public String toString() {
        return "Contact: " +
                "id: " + id +
                ", name: " + name +
                ", phoneNumber: " + phoneNumber +
                ", salary: " + salary +
                ", comment: " + comment + '\n';
    }
}
