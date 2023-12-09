package org.example.Junior.Traning;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.example.Junior.sem2.task3.Entity;
import org.example.Junior.sem2.task3.Table;

import java.sql.Date;

@Entity
@Table(name = "anya.users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "first_name")
    private String name;
    @Column(name = "second_name")
    private String secondName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "age")
    private int age;
    @Column(name = "reg_date")
    private Date date;
    @Column(name = "info")
    private String info;
    @Column(name = "group_id")
    private int groupId;
    @Column(name = "status_id")
    private int statusId;
    @Column(name = "date_session")
    private Date dateSession;
    @Column(name = "pay_id")
    private int payId;

    public User(String name, String secondName, String lastName, int age, Date date, String info, int groupId, int statusId, Date dateSession, int payId) {
        this.name = name;
        this.secondName = secondName;
        this.lastName = lastName;
        this.age = age;
        this.date = date;
        this.info = info;
        this.groupId = groupId;
        this.statusId = statusId;
        this.dateSession = dateSession;
        this.payId = payId;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", date=" + date +
                ", info='" + info + '\'' +
                ", groupId=" + groupId +
                ", statusId=" + statusId +
                ", dateSession=" + dateSession +
                ", payId=" + payId +
                '}';
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

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public int getStatusId() {
        return statusId;
    }

    public void setStatusId(int statusId) {
        this.statusId = statusId;
    }

    public Date getDateSession() {
        return dateSession;
    }

    public void setDateSession(Date dateSession) {
        this.dateSession = dateSession;
    }

    public int getPayId() {
        return payId;
    }

    public void setPayId(int payId) {
        this.payId = payId;
    }
}
