package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Toy> toyList = new ArrayList<>();
        toyList.add(new Toy("конструктор", 20));
        toyList.add(new Toy("автомат", 30));
        toyList.add(new Toy("ствол ", 30));

        for (int i = 0; i < toyList.size(); i++) {
            System.out.println(toyList.get(i));
        }
    }
}