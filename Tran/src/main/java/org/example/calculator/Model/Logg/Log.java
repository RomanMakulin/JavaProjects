package org.example.calculator.Model.Logg;

import org.example.calculator.Model.Logg.Logger;

public class Log implements Logger {
    public Log() {
    }

    @Override
    public void loggerOut(String massage) {
        System.out.println("log: " + massage);
    }
}
