package org.example.Model;

public class User{
    private String name;
    private int password;
    Basket basket;
    private int money;


    public User(String name, int password) {
        this.name = name;
        this.password = password;
        this.basket = new Basket();
        this.money = 2000;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public Basket getBasket() {
        return basket;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
