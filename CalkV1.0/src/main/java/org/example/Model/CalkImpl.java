package org.example.Model;

public class CalkImpl implements Calk {

    private int primaryArg;

    public CalkImpl(int primaryArg) {
        this.primaryArg = primaryArg;
    }

    @Override
    public int sum(int arg) {
        primaryArg += arg;
        return primaryArg;
    }

    @Override
    public int minus(int arg) {
        primaryArg -= arg;
        return primaryArg;
    }

    @Override
    public int milti(int arg) {
        primaryArg *= arg;
        return primaryArg;
    }

    @Override
    public int div(int arg) {
        primaryArg /= arg;
        return primaryArg;
    }
}
