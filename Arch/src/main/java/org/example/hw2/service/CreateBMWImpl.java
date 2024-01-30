package org.example.hw2.service;

import org.example.hw2.models.BMWImpl;
import org.example.hw2.models.Car;

public class CreateBMWImpl implements CarCreate{
    @Override
    public Car create() {
        return new BMWImpl();
    }
}
