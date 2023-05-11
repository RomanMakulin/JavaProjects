package org.example.Controller.FileWork.Notes;

import java.io.FileWriter;

public class CreateFile {
    public void create(String name){
        try{
            FileWriter writer = new FileWriter(name + ".csv");
            writer.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
