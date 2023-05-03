package org.example.Model;

public class User{
    private String name;
    private String password;
    Basket basket;
    private int money;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
        this.basket = new Basket();
        this.money = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
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
