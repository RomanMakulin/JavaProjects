package org.example.Controller.FilesWork;

import org.example.Model.Toy;

import java.util.Scanner;

public class Parse {
    public Toy parse(String line) {
        Scanner scanner = new Scanner(line);
        String[] values = scanner.nextLine().split(";");
        scanner.close();
        return new Toy(values[0], Integer.parseInt(values[1]));
    }
}
