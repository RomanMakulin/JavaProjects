package org.example.Controller.FileWork.UpdateFiles;

import org.example.Model.Card;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.List;

public class SaveCards {
    public void save(List<Card> cardList) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("Cards/cards.txt"));
            for (int l = 0; l < cardList.size(); l++) {
                Card card = cardList.get(l);
                bufferedWriter.write(card.getID() + ";" + card.getPin() + ";" + card.getMoney() + "\n");
            }
            bufferedWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
