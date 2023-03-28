package org.example.ActionsCalk.Model.Logger;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class LoggerImpl implements Logger{
    @Override
    public void loggerOut(int arg1, int arg2) throws IOException {
        FileWriter writer = new FileWriter("loggerActions.txt", true);
        BufferedWriter bufferedWriter = new BufferedWriter(writer);
        bufferedWriter.write(new Date() + " log: " + arg1 + ", " + arg2 + "\n");
        bufferedWriter.close();
    }
}
