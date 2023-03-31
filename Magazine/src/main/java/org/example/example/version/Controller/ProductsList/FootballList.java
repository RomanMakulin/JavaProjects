package org.example.example.version.Controller.ProductsList;

import org.example.example.version.Model.Interfaces.AddProduct;
import org.example.example.version.Model.Products.Product;

import java.util.ArrayList;
import java.util.List;

public class FootballList implements AddProduct {
    @Override
    public List<Product> add() {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Перчатки вратарские", 2000));
        productList.add(new Product("Бутсы", 4000));
        productList.add(new Product("Гетры", 1500));
        productList.add(new Product("Мяч футбольный", 3500));
        return productList;
    }
}
