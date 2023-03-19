package org.example.Warehouse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        ArrayList<Product> myOrder = new ArrayList<Product>(List.of(new Product("Товар", 2, 33),
                new Product("Товар", 3, 30)));

        Order order = new Order(myOrder);
    }
}
