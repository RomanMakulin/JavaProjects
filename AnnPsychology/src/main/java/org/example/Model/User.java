package org.example.Model;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.sql.Date;

@Getter
@Setter
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
}
