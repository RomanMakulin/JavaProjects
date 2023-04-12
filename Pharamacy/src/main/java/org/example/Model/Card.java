package org.example.Model;

public class Card {
    private int ID;
    private int pin;
    private int money;

    public Card(int ID, int pin, int money) {
        this.ID = ID;
        this.pin = pin;
        this.money = money;
    }

    public int getID() {
        return ID;
    }

    public int getPin() {
        return pin;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
