package org.example.Controller.FileWork.ReadProducts;

import org.example.Controller.FileWork.ReadUsers.ParseUsers;
import org.example.Model.Interfaces.ReadFile;
import org.example.Model.Medicines;
import org.example.Model.User;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadProducts implements ReadFile {
    @Override
    public List<Medicines> generate(String path){
        List<Medicines> medicinesList = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(new File(path));
            while (scanner.hasNextLine()) {
                medicinesList.add(new ParseProducts().parse(scanner.nextLine()));
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        return medicinesList;
    }
}
