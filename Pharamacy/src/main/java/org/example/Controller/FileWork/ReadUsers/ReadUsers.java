package org.example.Controller.FileWork.ReadUsers;

import org.example.Model.Interfaces.ReadFile;
import org.example.Model.User;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadUsers implements ReadFile {
    @Override
    public List<User> generate(String path){
        List<User> userList = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(new File(path));
            while (scanner.hasNextLine()) {
                userList.add(new ParseUsers().parse(scanner.nextLine()));
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        return userList;
    }
}
