package org.example.Controller.FileWork.ReadCards;

import org.example.Model.Card;
import org.example.Model.Interfaces.Parse;

import java.util.Scanner;

public class ParseCards implements Parse {
    @Override
    public Card parse(String line) {
        Scanner scanner = new Scanner(line);
        String[] values = scanner.nextLine().split(";");
        scanner.close();
        return new Card(Integer.parseInt(values[0]), Integer.parseInt(values[1]), Integer.parseInt(values[2]));
    }
}
