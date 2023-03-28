package org.example.Calk.Model.Logger;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import static java.nio.charset.StandardCharsets.UTF_8;

public class CreateFileLogImpl implements CalkLogger{
    @Override
    public void loggerOut(int arg) throws IOException {
        PrintWriter writer = new PrintWriter("logger.txt", UTF_8);
        writer.println(new Date() + " log started!\nlog: " + arg);
        writer.close();
    }
}
