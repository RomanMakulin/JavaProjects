package org.example.example.version.Model.User;

import org.example.example.version.Model.Products.Product;

import java.util.List;

public class User extends Basket {
    public String getName() {
        return name;
    }

    private String name;
    private String password;
    Basket basket;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
        this.basket = new Basket();
    }

    public String  getPassword() {
        return password;
    }
}
