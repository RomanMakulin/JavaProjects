package org.example.Warehouse.Impl;

import org.example.Warehouse.Product;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

public class Warehouse implements ChangeWarehouse{
    ArrayList<Product> productList;

    public Warehouse() {

        Random r = new Random();
        for (int i = 0; i < 5; i++) {
            productList.add(new Product("Товар", r.nextInt(10), r.nextInt(10,200)));
        }

    }

    @Override
    public void addProduct(List<Product> products) {

    }

    @Override
    public void removeProduct(List<Product> products) {

    }

    @Override
    public void decreaseProduct(Product products, int amount) {

    }

    @Override
    public void increaseProduct(Product products, int amount) {

    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (Product item: productList) {
            str.append(String.format("%s \n", item));
        }
        return str.toString();
    }
}
