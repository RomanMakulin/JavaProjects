package org.example.example.version.Model;

public class Product {
    private String name;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }
    @Override
    public String toString() {
        return "name: " + name+
                ", price: " + price;
    }
}
