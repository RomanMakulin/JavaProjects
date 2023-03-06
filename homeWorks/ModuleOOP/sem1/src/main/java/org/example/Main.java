package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        ArrayList<Product> array = new ArrayList<>();

        Product[] basket = {
                new Category("Мяч", 2000, 5, "Basketball"),
                new Category("Футболка", 2, 2, "Basketball"),
                new Category("Кроссовки", 2, 2, "Basketball")
        };

        for (Product item: basket) {
            System.out.println(item);
        }







    }
}