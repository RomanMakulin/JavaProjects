package org.example;

import java.util.Objects;

public class Philosopher extends Thread{
    protected Objects leftFork;
    protected Objects rightFork;
    protected String name;

    public Philosopher(Objects leftFork, Objects rightFork, String name) {
        this.leftFork = leftFork;
        this.rightFork = rightFork;
        this.name = name;
    }

    protected void action(String action) throws InterruptedException {
        System.out.println(action);
        Thread.sleep((long) (Math.random() * 100));
    }

    @Override
    public void run() {
        try {
            action(name + " думает");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
