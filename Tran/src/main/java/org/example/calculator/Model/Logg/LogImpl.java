package org.example.calculator.Model.Logg;

public class LogImpl implements Logger {
    public LogImpl() {
    }

    @Override
    public void loggerOut(String massage) {
        System.out.println("log: " + massage);
    }
}
