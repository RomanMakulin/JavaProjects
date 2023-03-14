package org.example.example;

import java.util.Objects;

public class Product {
    protected String name;
    protected int price;
    protected int rating;

    public Product(String name, int price, int rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public String prodInfo() {
        return String.format("Название товара: %s, стоимость: %d р., рейтинг: %d/5.", name, price, rating);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, price, rating);
    }

}
