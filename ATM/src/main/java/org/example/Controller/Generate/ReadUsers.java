package org.example.Controller.Generate;


import org.example.Model.User;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadUsers {
    public List<User> read() {
        List<User> userList = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(new File("users.csv"));
            while (scanner.hasNextLine()) {
                userList.add(new ParseUsers().parse(scanner.nextLine()));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return userList;
    }
}
