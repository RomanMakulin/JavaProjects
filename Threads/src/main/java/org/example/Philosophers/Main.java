package org.example.Philosophers;

public class Main {
    public static void main(String[] args) {

        Philosopher[] philosophersArr = new Philosopher[5];
        Fork[] forks = new Fork[philosophersArr.length];

        new Controller().fillForks(forks);
        new Controller().run(philosophersArr, forks);
    }
}