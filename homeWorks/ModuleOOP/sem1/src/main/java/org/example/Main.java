package org.example;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Product[] hockey = {
                new Product("шайба", 1500, 4),
                new Product("клюшка", 3500, 5),
                new Product("шлем", 2000, 2)
        };

        Product[] basketball = {
                new Product("мяч баскетборльный", 4000, 5),
                new Product("футболка", 1500, 3),
                new Product("кольцо", 6000, 4)
        };

        Product[] football = {
                new Product("мяч футбольный", 3000, 5),
                new Product("гетры", 1500, 3),
                new Product("шорты футбольные", 1000, 4)
        };


        Category[] shopList = {
                new Category("Баскетбол", basketball),
                new Category("Хоккей", hockey),
                new Category("Футбол", football)
        };

        System.out.println("=============================");
        System.out.println(" Весь ассортимент магазина: ");
        System.out.println("=============================");
        for (Category item : shopList) {
            System.out.println(item);
        }

        System.out.println("===============");
        System.out.println("Реализация покупок");

        User user1 = new User("123", "Roman");
        user1.put(0, basketball);
        user1.put(1, basketball);
        user1.showBasket();

        System.out.println();
        User user2 = new User("21", "Max");
        user2.put(0, football);
        user2.put(1, football);
        user2.showBasket();

        System.out.println("Users count: " + User.usersCount);

        System.out.println("=============================");
        System.out.println(" Весь ассортимент магазина: ");
        System.out.println("=============================");
        for (Category item : shopList) {
            System.out.println(item);
        }

    }
}