package org.example.Model.Logger;

import org.example.Model.Calk;

public class CalkLogImpl implements Calk {

    private int primaryArg;

    public CalkLogImpl(int primaryArg) {
        new CalkLoggerImpl().loggerOut(primaryArg);
        this.primaryArg = primaryArg;
    }

    @Override
    public int sum(int arg) {
        new CalkLoggerImpl().loggerOut(arg);
        primaryArg += arg;
        return primaryArg;
    }

    @Override
    public int minus(int arg) {
        new CalkLoggerImpl().loggerOut(arg);
        primaryArg -= arg;
        return primaryArg;
    }

    @Override
    public int milti(int arg) {
        new CalkLoggerImpl().loggerOut(arg);
        primaryArg *= arg;
        return primaryArg;
    }

    @Override
    public int div(int arg) {
        new CalkLoggerImpl().loggerOut(arg);
        primaryArg /= arg;
        return primaryArg;
    }

    @Override
    public int result() {
        new CalkLoggerImpl().loggerOut(primaryArg);
        return primaryArg;
    }
}
