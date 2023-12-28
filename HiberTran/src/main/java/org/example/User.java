package org.example;

import javax.persistence.*;
import java.security.SecureRandom;

@Entity
@Table(name = "test.users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected int id;
    @Column(name = "first_name")
    protected String firstName;
    @Column(name = "last_name")
    protected String lastName;

    protected String username;
    @Column(name = "user_password")
    protected String userPassword;
    @OneToOne (mappedBy = "user",cascade = CascadeType.ALL)
    protected Profile profile;

    public User() {
    }
    public User(String firstName, String lastName, String username, String userPassword) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.userPassword = userPassword;
    }
}
