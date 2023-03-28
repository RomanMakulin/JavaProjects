package org.example.Calk.Model.Logger;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CalkLoggerImpl implements CalkLogger {
    @Override
    public void loggerOut(int primaryArg) throws IOException {
        FileWriter writer = new FileWriter("logger.txt", true);
        BufferedWriter bufferedWriter = new BufferedWriter(writer);
        String textLog = "log: " + primaryArg;

        bufferedWriter.write(textLog);
        bufferedWriter.close();
        System.out.println(textLog);
    }
}
