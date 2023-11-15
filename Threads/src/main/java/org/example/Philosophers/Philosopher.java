package org.example.Philosophers;

import java.util.concurrent.Semaphore;

public class Philosopher extends Thread {
    protected Fork leftFork;
    protected Fork rightFork;
    protected String name;
    protected Semaphore semaphore;

    public Philosopher(Fork leftFork, Fork rightFork, String name, Semaphore sem) {
        this.leftFork = leftFork;
        this.rightFork = rightFork;
        this.name = name;
        this.semaphore = sem;
    }

    protected void action(String action) throws InterruptedException {
        System.out.println(action);
        Thread.sleep((long) (Math.random() * 100));
    }

    @Override
    public void run() {
        int countEating = 0;
        int maxCountEating = 3;
        try {
            action(name + " думает");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        while (countEating != maxCountEating) {
            try {
                if (rightFork.isFree() && leftFork.isFree()) {
                    semaphore.acquire();
                    rightFork.setFree(false);
                    leftFork.setFree(false);
                    countEating++;
                    synchronized (leftFork) {
                        action(name + " взял левую вилку");
                        synchronized (rightFork) {
                            action(name + " взял правую вилку и начал есть " + "[" + countEating + "] раз");
                        }
                    }
                    endEating();
                }

            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
    public void endEating() throws InterruptedException {
        action(name + " закончил прием еды, положил вилки и думает");
        rightFork.setFree(true);
        leftFork.setFree(true);
        semaphore.release();
    }
}
