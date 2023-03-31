package org.example.example.version.Controller.ProductsList;

import org.example.example.version.Model.Interfaces.AddProduct;
import org.example.example.version.Model.Products.Product;

import java.util.ArrayList;
import java.util.List;

public class HockeyList implements AddProduct {
    @Override
    public List<Product> add() {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Клюшка", 4000));
        productList.add(new Product("Шлем", 5000));
        return productList;
    }
}
