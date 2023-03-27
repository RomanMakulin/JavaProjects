package org.example.ActionsCalk.Model.Logger;

public class LoggerImpl implements Logger{
    @Override
    public void loggerOut(String massage) {
        System.out.println("log: " + massage);
    }
}
