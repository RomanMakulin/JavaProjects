package org.example.Controller.Cards;

import org.example.Model.Card;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CardsFromFile {
    public List<Card> generate(){
        List<Card> cardList = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(new File("cards.txt"));
            while (scanner.hasNextLine()) {
                cardList.add(new Parse().parse(scanner.nextLine()));
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        return cardList;
    }
}
