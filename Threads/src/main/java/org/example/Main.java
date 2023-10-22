package org.example;

public class Main {
    public static void main(String[] args) {
        Thread thread = new Thread(new TicTac("1"));
        Thread thread2 = new Thread(new TicTac("2"));
        Thread thread3 = new Thread(new TicTac("3"));
        Thread thread4 = new Thread(new TicTac(" "));

        thread.start();
        thread2.start();
        thread3.start();
        thread4.start();

    }
}