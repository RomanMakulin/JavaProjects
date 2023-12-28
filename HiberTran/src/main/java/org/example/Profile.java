package org.example;

import javax.persistence.*;

@Entity
@Table(name = "profile", schema = "test")
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected int id;
    @OneToOne
    @JoinColumn (name = "users_id")
    protected User user;

    public Profile() {
    }

    public Profile(User user) {
        this.user = user;
    }
}
