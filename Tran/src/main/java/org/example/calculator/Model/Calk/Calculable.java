package org.example.calculator.Model.Calk;

public interface Calculable {
    Calculable sum(int arg);
    Calculable multi(int arg);
    Calculable div(int arg);
    int getResult();
}
