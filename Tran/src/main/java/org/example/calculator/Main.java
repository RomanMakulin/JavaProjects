package org.example.calculator;

// Создать логирование операций, для класса Calculator. Класс Calculator не должен изменится.
public class Main {
    public static void main(String[] args) {
        ICalculableFactory calculableFactory = new FactoryLog();
//        FactoryLog factoryLog = new FactoryLog(calculableFactory);
        ViewCalculator view = new ViewCalculator(calculableFactory);

        view.run();
    }
}
