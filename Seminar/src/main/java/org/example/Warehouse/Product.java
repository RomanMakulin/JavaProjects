package org.example.Warehouse;

import org.example.Warehouse.Impl.changeProduct;

public class Product implements changeProduct {
    String name;
    int count;
    double price;

    public Product(String name, int count, double price) {
        this.name = name;
        this.count = count;
        this.price = price;
    }
    @Override
    public void decreaseCount(int  amount){
        this.count -= amount;
    }

    @Override
    public void increaseCount(int  amount){
        this.count += amount;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", count=" + count +
                ", price=" + price +
                '}';
    }
}
