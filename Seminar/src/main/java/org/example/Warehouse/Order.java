package org.example.Warehouse;

import org.example.Warehouse.Impl.Warehouse;
import org.example.Warehouse.Impl.changeProduct;

import java.util.ArrayList;

public class Order implements changeProduct {
    Warehouse warehouse;
    ArrayList<Product> basket;

    public Order(Warehouse warehouse, ArrayList<Product> basket) {
        this.warehouse = new Warehouse();
        this.basket = basket;
    }


    @Override
    public void decreaseCount(int amount) {

    }

    @Override
    public void increaseCount(int amount) {

    }
}
