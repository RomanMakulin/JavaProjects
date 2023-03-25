package org.example.calculator;

public class Log implements Logger{
    public Log() {
    }

    @Override
    public void loggerOut(String massage) {
        System.out.println("log: " + massage);
    }
}
