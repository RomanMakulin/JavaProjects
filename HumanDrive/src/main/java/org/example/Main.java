package org.example;

public class Main {
    public static void main(String[] args) {

        Human human = new Human();
        Bicycle bicycle = new Bicycle();

        human.stop();
        human.drive(bicycle);
        human.stop();

    }
}