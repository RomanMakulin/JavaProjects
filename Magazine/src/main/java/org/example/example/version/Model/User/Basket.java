package org.example.example.version.Model.User;

import org.example.example.version.Model.Products.Product;
import org.example.example.version.VIew.InputInt;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    List<Product> basketList;

    public Basket() {
        this.basketList = new ArrayList<>();
    }

    public void put(List<Product> productList) {
        int needID = new InputInt().input("Введите айди для покупки товара: ");
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getID() == needID) {
                basketList.add(productList.get(i));
                productList.remove(i);
            }
        }
    }

    public void show() {
        for (int i = 0; i < basketList.size(); i++) {
            System.out.println(basketList.get(i));
        }
    }
}
