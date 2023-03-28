package org.example.Controller.FileWork;

import org.example.Model.City;

import java.util.Scanner;

public class Parse {
    City parse(String line) {
        Scanner scanner = new Scanner(line);
        String[] values = scanner.nextLine().split(";", 6);
        scanner.close();
        return new City(Integer.parseInt(values[0]), values[1], values[2], values[3], Integer.parseInt(values[4]), values[5]);
    }
}
