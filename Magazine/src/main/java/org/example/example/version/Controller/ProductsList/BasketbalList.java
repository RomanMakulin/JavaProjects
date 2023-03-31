package org.example.example.version.Controller.ProductsList;

import org.example.example.version.Model.Interfaces.AddProduct;
import org.example.example.version.Model.Products.Product;

import java.util.ArrayList;
import java.util.List;


public class BasketbalList implements AddProduct {
    @Override
    public List<Product> add() {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Мяч баскетбольный", 4000));
        productList.add(new Product("Кольцо", 8000));
        productList.add(new Product("Майка", 2500));
        return productList;
    }
}
