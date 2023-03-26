package org.example.calculator.Model.Logg;

import org.example.calculator.Model.Calk.Calculable;

public class LogCalc implements Calculable {

    private int primaryArg;
    private LogImpl log;


    public LogCalc(int primaryArg, LogImpl log) {
        this.log = log;
        log.loggerOut("" + primaryArg);
        this.primaryArg = primaryArg;
    }

    @Override
    public Calculable sum(int arg) {
        log.loggerOut("" + arg);
        primaryArg += arg;
        return this;
    }

    @Override
    public Calculable multi(int arg) {
        log.loggerOut("" + arg);
        primaryArg *= arg;
        return this;
    }

    @Override
    public Calculable div(int arg) {
        log.loggerOut("" + arg);
        primaryArg /= arg;
        return this;
    }

    @Override
    public int getResult() {
        log.loggerOut("" + primaryArg);
        return primaryArg;
    }
}
