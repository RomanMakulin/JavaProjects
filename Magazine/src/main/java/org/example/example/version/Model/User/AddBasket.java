package org.example.example.version.Model.User;

import org.example.example.version.Model.Products.Product;
import org.example.example.version.View.InputInt;

import java.util.List;

public class AddBasket {
    public void add(List<Product> basketList, List<Product> productList){
        basketList.add(productList.get(new InputInt().input("Введите айди: ")));
    }
}
