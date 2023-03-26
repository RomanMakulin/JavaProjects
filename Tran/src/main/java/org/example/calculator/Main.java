package org.example.calculator;

import org.example.calculator.Model.Calk.CalculableFactoryImpl;
import org.example.calculator.Model.Logg.FactoryLog;
import org.example.calculator.Model.Calk.ICalculableFactory;
import org.example.calculator.View.ViewCalculator;

// Создать логирование операций, для класса Calculator. Класс Calculator не должен изменится.
public class Main {
    public static void main(String[] args) {
        ICalculableFactory calculableFactory = new FactoryLog();
        ViewCalculator view = new ViewCalculator(calculableFactory);

        view.run();







    }
}
