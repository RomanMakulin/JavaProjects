package org.example;

import javax.swing.*;

public class User {
    private String password;
    private String login;
    private Basket basket;

    public User(String password, String login) {
        this.password = password;
        this.login = login;
        this.basket = new Basket();
    }


    public Basket getBasket() {
        return basket;
    }

    public String getLogin() {
        return login;
    }

    public void PutBasket(Product i){
        basket.addBasket(i);
    }

    public void removeFromBasket(Product i){
        basket.removeFromBasket(i);
    }

    public void clearBasket(){
        basket.clear();
    }

    public void checkBasket(){
        System.out.println("Корзина покупателя "+this.login+" :");
        this.basket.showBasket();
    }


}
