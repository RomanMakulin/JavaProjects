package org.example.Calk.Model.Logger;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Date;

public class CalkLoggerImpl implements CalkLogger {
    @Override
    public void loggerOut(int primaryArg){
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("logger.txt", true));
            bufferedWriter.write(new Date() + " log: " + primaryArg + "\n");
            bufferedWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
