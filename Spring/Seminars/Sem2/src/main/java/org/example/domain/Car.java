package org.example.domain;

import org.springframework.stereotype.Component;

@Component
public class Car {
    private String model = "E7";
    private String made = "Mercedes";
    private iEngine engine;

    public Car(iEngine iEngine) {
        this.engine = iEngine;
        System.out.println("Автомобиль создан");
    }

    public iEngine getEngine() {
        return engine;
    }

    public void setEngine(iEngine engine) {
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMade() {
        return made;
    }

    public void setMade(String made) {
        this.made = made;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", made='" + made + '\'' +
                '}';
    }
    public void go(){
        engine.startEngine();
    }
}
