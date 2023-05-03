package org.example.Controller.FileWork.UpdateFiles;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class SaveUser {
    public void save(String name, String password, String path){
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
