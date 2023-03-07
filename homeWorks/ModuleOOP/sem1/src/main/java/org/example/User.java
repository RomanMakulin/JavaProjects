package org.example;

import javax.swing.*;

public class User {
    private String password;
    private String login;
    Basket basket;

    public User(String password, String login) {
        this.password = password;
        this.login = login;
        this.basket = new Basket();
    }

    public void putBasket(int needNum, Product[] i) {
        basket.put(needNum, i);
    }

    public void checkBasket() {
        System.out.println("Корзина покупателя " + this.login + ":");
        this.basket.showBasket();
    }

}
