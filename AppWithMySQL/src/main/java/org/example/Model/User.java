package org.example.Model;

import org.example.View.InputUsersInfo.ageInput;
import org.example.View.InputUsersInfo.firstName;
import org.example.View.InputUsersInfo.lastName;

import java.sql.Date;

public class User {
    private int id;
    private  String first_name;
    private  String last_name;
    private  int age;
    private  int id_group;
    private String groupName;
    private  int id_payment;
    private String paymentStatus;
    private Date date;

    public User() {
        this.first_name = new firstName().input();;
        this.last_name = new lastName().input();
        this.age = new ageInput().input();
        this.id_group = 1;
        this.id_payment = 0;
    }

    public User(int id, String first_name, String last_name, int age, String groupName, String paymentStatus, Date date) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.age = age;
        this.groupName = groupName;
        this.paymentStatus = paymentStatus;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId_group() {
        return id_group;
    }

    public void setId_group(int id_group) {
        this.id_group = id_group;
    }

    public int getId_payment() {
        return id_payment;
    }

    public void setId_payment(int id_payment) {
        this.id_payment = id_payment;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "user: " + "id: " + id + ", firstName: " + first_name +
                ", lastName: " + last_name + ", age: " + age +
                ", groupName: " + groupName + ", paymentStatus: " + paymentStatus + ", date: " + date;
    }
}
