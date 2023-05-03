package org.example.Controller.FileWork.ReadUsers;

import org.example.Model.Card;
import org.example.Model.Interfaces.Parse;
import org.example.Model.User;

import java.util.Scanner;

public class ParseUsers implements Parse {
    @Override
    public User parse(String line) {
        Scanner scanner = new Scanner(line);
        String[] values = scanner.nextLine().split(";");
        scanner.close();
        return new User(values[0], values[1]);
    }
}
