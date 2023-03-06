package org.example;

import java.util.ArrayList;

public class Category extends Product {
    public String PosName;
    public Product[] AllProducts;


    public Category(String name, int price, int rating, String PosName, Product[] allProducts) {
        super(name, price, rating);
        this.name = PosName;
        AllProducts = allProducts;
    }

    public Category(String name, int price, int rating, String name1) {
        super(name, price, rating);
        this.name = name1;
    }

    @Override
    public String toString() {
        StringBuilder list = new StringBuilder();
        for (Product item: AllProducts){
            list.append(item.prodInfo());
            list.append("\n");
        }
        return String.format("%s\n%s", name, list);
    }
}
