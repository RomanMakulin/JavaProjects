package org.example.hw2.controller;

import org.example.hw2.models.Car;
import org.example.hw2.service.CarCreate;
import org.example.hw2.service.CreateBMWImpl;
import org.example.hw2.service.CreateTeslaImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Controller {
    public void btnClick() {
        List<Car> carList = new ArrayList<>(Arrays.asList(
                new CreateBMWImpl().create(),
                new CreateTeslaImpl().create(),
                new CreateTeslaImpl().create(),
                new CreateTeslaImpl().create()
        ));

        carList.forEach(Car::fill);
    }
}
