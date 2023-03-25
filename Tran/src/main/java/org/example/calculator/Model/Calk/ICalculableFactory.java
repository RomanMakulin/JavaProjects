package org.example.calculator.Model.Calk;

import org.example.calculator.Model.Calk.Calculable;

public interface ICalculableFactory {
    Calculable create(int primaryArg);
}
