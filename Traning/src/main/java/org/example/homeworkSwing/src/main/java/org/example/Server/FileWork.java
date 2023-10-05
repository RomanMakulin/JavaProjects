package org.example.Server;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileWork implements FileView{
    @Override
    public void fileRead(ArrayList<String> stringList){
        File fileReader = new File("logs.txt");

        try {
            Scanner scanner = new Scanner(fileReader);
            while (scanner.hasNextLine()){
                stringList.add(scanner.nextLine());
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @Override
    public void sendLog(String line){
        try (FileWriter fr = new FileWriter("logs.txt", true)) {
            fr.write(line);
            fr.flush();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}
