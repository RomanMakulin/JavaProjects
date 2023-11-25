package org.example.example.version.Model.User;

import org.example.example.version.Model.Products.Product;
import org.example.example.version.View.InputIdProduct;
import java.util.ArrayList;
import java.util.List;

public class Basket {
    List<Product> basketList;

    public Basket() {
        this.basketList = new ArrayList<>();
    }

    public void put(List<Product> productList) {

        int needID = new InputIdProduct().input();

        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getID() == needID) {
                basketList.add(productList.get(i));
                productList.remove(i);
            }
        }
    }

    public void show() {
        basketList.stream().forEach(System.out::println);
    }
}
