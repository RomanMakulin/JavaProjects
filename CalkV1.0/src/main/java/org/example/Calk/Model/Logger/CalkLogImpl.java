package org.example.Calk.Model.Logger;

import org.example.Calk.Model.Calk.Calk;
import java.io.IOException;

public class CalkLogImpl implements Calk {

    private int primaryArg;

    public CalkLogImpl(int primaryArg) throws IOException {
        new CalkLoggerImpl().loggerOut(primaryArg);
        this.primaryArg = primaryArg;
        new CreateFileLogImpl().loggerOut(primaryArg);
    }

    @Override
    public int sum(int arg) throws IOException {
        new CalkLoggerImpl().loggerOut(arg);
        primaryArg += arg;
        return primaryArg;
    }

    @Override
    public int minus(int arg) throws IOException {
        new CalkLoggerImpl().loggerOut(arg);
        primaryArg -= arg;
        return primaryArg;
    }

    @Override
    public int milti(int arg) throws IOException {
        new CalkLoggerImpl().loggerOut(arg);
        primaryArg *= arg;
        return primaryArg;
    }

    @Override
    public int div(int arg) throws IOException {
        new CalkLoggerImpl().loggerOut(arg);
        primaryArg /= arg;
        return primaryArg;
    }

    @Override
    public int result() throws IOException {
        new CalkLoggerImpl().loggerOut(primaryArg);
        return primaryArg;
    }
}
