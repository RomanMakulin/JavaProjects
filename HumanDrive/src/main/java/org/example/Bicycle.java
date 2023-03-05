package org.example;

public class Bicycle implements Transport {

    @Override
    public void start() {
        System.out.println("Едем на велике...");
    }

    @Override
    public void stop() {
        System.out.println("Велик остановился");
    }
}
