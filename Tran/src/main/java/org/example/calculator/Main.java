package org.example.calculator;

import org.example.calculator.Model.FactoryLog;
import org.example.calculator.Model.Calk.ICalculableFactory;
import org.example.calculator.View.ViewCalculator;

// Создать логирование операций, для класса Calculator. Класс Calculator не должен изменится.
public class Main {
    public static void main(String[] args) {
        ICalculableFactory calculableFactory = new FactoryLog();
//        FactoryLog factoryLog = new FactoryLog(calculableFactory);
        ViewCalculator view = new ViewCalculator(calculableFactory);

        view.run();
    }
}
