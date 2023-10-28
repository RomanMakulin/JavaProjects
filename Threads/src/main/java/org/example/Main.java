package org.example;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        Philosopher[] philosophersArr = new Philosopher[5];
        Object[] forks = new Object[philosophersArr.length];

        new Controller().fillForks(forks);
        new Controller().run(philosophersArr, forks);
    }
}