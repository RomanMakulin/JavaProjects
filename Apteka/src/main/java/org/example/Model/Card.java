package org.example.Model;

public class Card {
    private int ID;
    private String login;
    private int pin;
    private int money;

    public Card(int ID, String login, int pin, int money) {
        this.ID = ID;
        this.login = login;
        this.pin = pin;
        this.money = money;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
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
}
