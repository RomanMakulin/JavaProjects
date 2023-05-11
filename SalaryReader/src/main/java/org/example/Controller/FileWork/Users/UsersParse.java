package org.example.Controller.FileWork.Users;

import org.example.Model.User;
import java.util.Scanner;

public class UsersParse {
    public User parse(String line){

        Scanner scanner = new Scanner(line);
        String[] values = scanner.nextLine().split(";");
        scanner.close();

        return new User(values[0], values[1]);

    }
}
