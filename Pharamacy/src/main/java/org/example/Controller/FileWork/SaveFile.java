package org.example.Controller.FileWork;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class SaveFile {
    public void save(String name, int password, String path){
        try {
            FileWriter writer = new FileWriter(path, true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write("\n" + name + ";" + password);
            bufferedWriter.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
