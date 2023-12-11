package org.example.Model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "anya.users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "second_name")
    private String secondName;
    @Column(name = "last_name")
    private String lastName;
    private int age;
    @Column(name = "reg_date")
    private Date regDate;
    private String info;
    @Column(name = "group_id")
    private int groupID;
    @Column(name = "status_id")
    private int statusID;
    @Column(name = "date_session")
    private Date dateSession;
    @Column(name = "pay_id")
    private int payID;

    public User(String firstName, String secondName, String lastName, int age, Date regDate, String info, int groupID, int statusID, Date dateSession, int payID) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
        this.age = age;
        this.regDate = regDate;
        this.info = info;
        this.groupID = groupID;
        this.statusID = statusID;
        this.dateSession = dateSession;
        this.payID = payID;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", regDate=" + regDate +
                ", info='" + info + '\'' +
                ", groupID=" + groupID +
                ", statusID=" + statusID +
                ", dateSession=" + dateSession +
                ", payID=" + payID +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
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

    public Date getRegDate() {
        return regDate;
    }

    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public int getGroupID() {
        return groupID;
    }

    public void setGroupID(int groupID) {
        this.groupID = groupID;
    }

    public int getStatusID() {
        return statusID;
    }

    public void setStatusID(int statusID) {
        this.statusID = statusID;
    }

    public Date getDateSession() {
        return dateSession;
    }

    public void setDateSession(Date dateSession) {
        this.dateSession = dateSession;
    }

    public int getPayID() {
        return payID;
    }

    public void setPayID(int payID) {
        this.payID = payID;
    }
}
