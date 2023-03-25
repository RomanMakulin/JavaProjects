package org.example.calculator.Model;

import org.example.calculator.Model.Calk.Calculable;
import org.example.calculator.Model.Calk.ICalculableFactory;
import org.example.calculator.Model.Logg.Log;

public class FactoryLog implements ICalculableFactory {
    @Override
    public Calculable create(int primaryArg) {
//        new Log().loggerOut("" + primaryArg);
        return new LogCalc(primaryArg, new Log());
    }
}
