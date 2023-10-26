package org.example;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        Philosopher[] philosophersArr = new Philosopher[5];
        Object[] forks = new Object[philosophersArr.length];

        for (int i = 0; i < forks.length; i++) {
            forks[i] = new Object();
        }

        for (int i = 0; i < philosophersArr.length; i++) {
            Object leftFork = forks[i];
            Object rightFork = forks[(i+1) % forks.length];

            if (i == philosophersArr.length-1){
                philosophersArr[i] = new Philosopher(rightFork, leftFork, "Философ № " + i);
            } else {
                philosophersArr[i] = new Philosopher(leftFork, rightFork, "Философ № " + i);
            }

            Thread thread = new Thread(philosophersArr[i]);
            thread.start();

        }

    }

}