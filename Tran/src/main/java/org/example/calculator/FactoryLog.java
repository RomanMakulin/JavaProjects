package org.example.calculator;

public class FactoryLog implements ICalculableFactory{
    @Override
    public Calculable create(int primaryArg) {
//        new Log().loggerOut("" + primaryArg);
        return new LogCalc(primaryArg, new Log());
    }
}
