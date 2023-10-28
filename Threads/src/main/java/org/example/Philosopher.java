package org.example;

import java.util.Objects;

public class Philosopher extends Thread {
    protected Object leftFork;
    protected Object rightFork;
    protected String name;

    public Philosopher(Object leftFork, Object rightFork, String name) {
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
        for (int i = 0; i < 3; i++) {
            try {
                action(name + " думает");
                synchronized (leftFork) {
                    action(name + " взял левую вилку");
                    synchronized (rightFork) {
                        action(name + " взял правую вилку и начал есть " + "[" + (i+1) + "] раз");
                    }
                }
                action(name + " закончил прием еды, положил вилки и думает");

            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
