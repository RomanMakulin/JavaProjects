package org.example.calculator.Model.Calk;

import org.example.calculator.Model.Calk.Calculable;
import org.example.calculator.Model.Calk.Calculator;
import org.example.calculator.Model.Calk.ICalculableFactory;

public class CalculableFactory implements ICalculableFactory {
    public Calculable create(int primaryArg) {
        return new Calculator(primaryArg);
    }
}
