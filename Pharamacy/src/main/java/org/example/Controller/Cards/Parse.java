package org.example.Controller.Cards;

import org.example.Model.Card;

import java.util.Scanner;

public class Parse {
    public Card parse(String line) {
        Scanner scanner = new Scanner(line);
        String[] values = scanner.nextLine().split(";");
        scanner.close();
        return new Card(Integer.parseInt(values[0]), Integer.parseInt(values[1]), Integer.parseInt(values[2]));
    }
}
