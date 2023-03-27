package org.example.Calk.Model.Logger;

public class CalkLoggerImpl implements CalkLogger {
    @Override
    public void loggerOut(int primaryArg) {
        System.out.println("log: " + primaryArg);
    }
}
