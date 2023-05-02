package org.example.Controller.FileWork.ReadProducts;

import org.example.Model.Interfaces.Parse;
import org.example.Model.Medicines;
import org.example.Model.User;

import java.util.Scanner;

public class ParseProducts implements Parse {
    @Override
    public Medicines parse(String line) {
        Scanner scanner = new Scanner(line);
        String[] values = scanner.nextLine().split(";");
        scanner.close();
        return new Medicines(values[0], Integer.parseInt(values[1]), Integer.parseInt(values[2]));
    }
}
