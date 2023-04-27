package org.example.Controller.FilesWork;

import org.example.Model.Toy;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.List;

public class WriterFile {
    public void file(List<Toy> myList, String path){
        try{
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path));
            for (int i = 0; i < myList.size(); i++) {
                bufferedWriter.write(myList.get(i).getName() + ";" + myList.get(i).getWidth() + "\n");
            }
            bufferedWriter.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
