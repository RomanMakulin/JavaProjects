package org.example;

import java.util.ArrayList;

public class Category {
    public String name;
    public Product[] AllProducts;

    public Category(String name) {
        this.name = name;
    }

    public Category(String name, Product[] allProducts) {
        this.name = name;
        AllProducts = allProducts;
    }

    @Override
    public String toString() {
        StringBuilder list = new StringBuilder();
        for (Product item : AllProducts) {
            list.append(item.prodInfo());
            list.append("\n");
        }
        return String.format("%s:\n%s", name, list);
    }

}
