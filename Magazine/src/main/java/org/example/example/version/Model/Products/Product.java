package org.example.example.version.Model.Products;

public class Product {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    private String name;
    private int price;
    static int count;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    private int ID;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
        this.ID = count++;
    }
    @Override
    public String toString() {
        return name +
                ", price: " + price +
                ", ID: " + ID;
    }
}
