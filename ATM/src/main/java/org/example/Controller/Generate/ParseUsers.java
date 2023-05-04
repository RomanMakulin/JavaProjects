package org.example.Controller.Generate;

import org.example.Model.User;

import java.util.Scanner;

public class ParseUsers {
    public User parse(String line){
        Scanner scanner = new Scanner(line);
        String[] values =scanner.nextLine().split(";");
        scanner.close();
        return new User(values[0], Integer.parseInt(values[1]), Integer.parseInt(values[2]), Integer.parseInt(values[3]));
    }
}
