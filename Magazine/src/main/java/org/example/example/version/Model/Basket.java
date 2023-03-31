package org.example.example.version.Model;

import org.example.example.version.VIew.InputInt;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    List<Product> basketList;

    public Basket(List<Product> basketList) {
        this.basketList = new ArrayList<>();
    }

    public void put(List<Product> productList){
        basketList.add(productList.get(new InputInt().input("Введите айди: ")));
    }
}
