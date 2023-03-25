package org.example.Model;

public class Sum implements Action{

    private int primaryArg;

    public Sum(int primaryArg) {
        this.primaryArg = primaryArg;
    }

    @Override
    public int action(int arg) {
        primaryArg += arg;
        return this.primaryArg;
    }
}
