package org.example.Model.Logger;

import org.example.Model.Calk;

public class LogCalk implements Calk {

    private int primaryArg;

    public LogCalk(int primaryArg) {
        new LogImpl().loggerOut(primaryArg);
        this.primaryArg = primaryArg;
    }

    @Override
    public int sum(int arg) {
        new LogImpl().loggerOut(arg);
        primaryArg += arg;
        return primaryArg;
    }

    @Override
    public int minus(int arg) {
        new LogImpl().loggerOut(arg);
        primaryArg -= arg;
        return primaryArg;
    }

    @Override
    public int milti(int arg) {
        new LogImpl().loggerOut(arg);
        primaryArg *= arg;
        return primaryArg;
    }

    @Override
    public int div(int arg) {
        new LogImpl().loggerOut(arg);
        primaryArg /= arg;
        return primaryArg;
    }

    @Override
    public int result() {
        new LogImpl().loggerOut(primaryArg);
        return primaryArg;
    }
}
