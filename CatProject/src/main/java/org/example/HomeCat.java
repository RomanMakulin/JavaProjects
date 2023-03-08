package org.example;

public class HomeCat extends Cat {
    static int homeCatCount;

    public HomeCat(String name) {
        super(name, 200, 0, "Домашний кот");
        homeCatCount++;
    }
}
