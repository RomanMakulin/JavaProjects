package org.example.Controller.FileWork.ReadCards;

import org.example.Model.Card;
import org.example.Model.Interfaces.ReadFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadCards implements ReadFile {
    @Override
    public List<Card> generate(String path){
        List<Card> cardList = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(new File(path));
            while (scanner.hasNextLine()) {
                cardList.add(new ParseCards().parse(scanner.nextLine()));
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        return cardList;
    }
}
