package org.example.Core.Model;

public class Contact {
    protected String name;
    protected long phoneNumber;
    protected int salary;
    protected String comment;

    public Contact(String name, long phoneNumber, int salary, String comment) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.comment = comment;
    }
}
