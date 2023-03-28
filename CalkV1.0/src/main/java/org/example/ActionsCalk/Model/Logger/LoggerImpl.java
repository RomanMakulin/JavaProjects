package org.example.ActionsCalk.Model.Logger;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Date;

public class LoggerImpl implements Logger {
    @Override
    public void loggerOut(int arg1, int arg2){
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("loggerActions.txt", true));
            bufferedWriter.write(new Date() + " log: " + arg1 + ", " + arg2 + "\n");
            bufferedWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
