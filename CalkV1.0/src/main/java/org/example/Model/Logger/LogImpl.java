package org.example.Model.Logger;

public class LogImpl implements Logger {
    @Override
    public void loggerOut(int primaryArg) {
        System.out.println("log: " + primaryArg);
    }
}
