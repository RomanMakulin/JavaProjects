package org.example.calculator.Model.Calk;

public class CalculableFactoryImpl implements ICalculableFactory {
    public Calculable create(int primaryArg) {
        return new CalculatorImpl(primaryArg);
    }
}
