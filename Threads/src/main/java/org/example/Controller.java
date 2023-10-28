package org.example;

public class Controller {
    public void fillForks(Object[] forks){
        for (int i = 0; i < forks.length; i++) {
            forks[i] = new Object();
        }
    }
    public void run(Philosopher[] philosophersArr, Object[] forks){
        for (int i = 0; i < philosophersArr.length; i++) {
            Object leftFork = forks[i];
            Object rightFork = forks[(i+1) % forks.length];

            if (i == philosophersArr.length-1){
                philosophersArr[i] = new Philosopher(rightFork, leftFork, "Философ № " + (i+1));
            } else {
                philosophersArr[i] = new Philosopher(leftFork, rightFork, "Философ № " + (i+1));
            }

            Thread thread = new Thread(philosophersArr[i]);
            thread.start();
        }
    }
}
