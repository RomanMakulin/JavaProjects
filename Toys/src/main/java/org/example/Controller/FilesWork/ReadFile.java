package org.example.Controller.FilesWork;

import org.example.Model.Toy;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadFile {
    public List<Toy> read(String path) {
        List<Toy> toyList = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(new File(path));
            while (scanner.hasNextLine()) {
                toyList.add(new Parse().parse(scanner.nextLine()));
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        return toyList;
    }
}
