package org.example.calculator.Model.Calk;

public final class CalculatorImpl implements Calculable {

    private int primaryArg;

    public CalculatorImpl(int primaryArg) {
        this.primaryArg = primaryArg;
    }

    @Override
    public Calculable sum(int arg) {
        primaryArg += arg;
        return this;
    }

    @Override
    public Calculable multi(int arg) {
        primaryArg *= arg;
        return this;
    }

    @Override
    public Calculable div(int arg) {
        primaryArg /= arg;
        return this;
    }

    @Override
    public int getResult() {
        return primaryArg;
    }
}
