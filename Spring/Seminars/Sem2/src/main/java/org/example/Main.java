package org.example;

import org.example.config.ProjectConfig;
import org.example.domain.Car;
import org.example.domain.DieselEngine;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Car car = context.getBean(Car.class);
        car.go();
        System.out.println("-------------");
        DieselEngine dieselEngine = context.getBean(DieselEngine.class);



    }
}