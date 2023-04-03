package org.example;

public class User {
    private String login;
    private int pin;
    private int money;
    private int cash;

    public User(String login, int pin, int money, int cash) {
        this.login = login;
        this.pin = pin;
        this.money = money;
        this.cash = cash;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", pin=" + pin +
                ", money=" + money +
                ", cash=" + cash +
                '}';
    }
}
