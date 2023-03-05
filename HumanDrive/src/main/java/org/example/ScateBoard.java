package org.example;

public class ScateBoard implements Transport{
    @Override
    public void start() {
        System.out.println("Едем на скейте...");
    }

    @Override
    public void stop() {
        System.out.println("Скейт остановился");
    }
}
