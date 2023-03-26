package org.example.calculator.Model.Logg;

import org.example.calculator.Model.Calk.Calculable;
import org.example.calculator.Model.Calk.ICalculableFactory;

public class FactoryLog implements ICalculableFactory {
    @Override
    public Calculable create(int primaryArg) {
        return new LogCalc(primaryArg, new LogImpl());
    }

}
