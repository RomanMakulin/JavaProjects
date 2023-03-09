package org.example;

import javax.swing.*;

public class User extends Basket {
    private String password;
    private String login;
    Basket basket;
    static int usersCount;

    public User(String password, String login) {
        this.password = password;
        this.login = login;
        this.basket = new Basket();
        usersCount++;
    }
}
