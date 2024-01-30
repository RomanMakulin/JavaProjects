package org.example.hw2.service;


import org.example.hw2.models.Car;
import org.example.hw2.models.TeslaImpl;

public class CreateTeslaImpl implements CarCreate {
    @Override
    public Car create() {
        return new TeslaImpl();
    }
}
