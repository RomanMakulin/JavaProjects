package org.example;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class FileWork {
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
}
