package com.example.SpringFirstProject;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class Car {
    Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void start(){
        engine.go();
    }
}
