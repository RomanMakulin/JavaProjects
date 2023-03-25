package org.example.calculator;

public class LogCalc implements Calculable{

    private int primaryArg;
    private Log logger;

    public LogCalc(int primaryArg, Log logger) {
        this.logger = logger;
        logger.loggerOut("" + primaryArg);
        this.primaryArg = primaryArg;
    }

    @Override
    public Calculable sum(int arg) {
        logger.loggerOut("" + arg);
        return null;
    }

    @Override
    public Calculable multi(int arg) {
        logger.loggerOut("" + arg);
        return null;
    }

    @Override
    public int getResult() {
        logger.loggerOut("" + primaryArg);
        return 0;
    }
}
