package org.example;

import org.example.Model.Answer;
import org.example.Model.Game;
import org.example.View.InputWorld;

public class AnswerLogic {
    public void buttonClick(Game game) {

        int maxTry = game.getMaxTry();
        int count = 0;

        while (game.getMaxTry() > 0) {
            Answer answer = new Answer();
            for (int i = 0; i < game.getWord().length(); i++) {
                if (game.getWord().charAt(i) == answer.getUserInput().charAt(i)) {
                    answer.setBulls(answer.getBulls() + 1);
                }
                if (game.getWord().contains(Character.toString(answer.getUserInput().charAt(i)))) {
                    answer.setCows(answer.getCows() + 1);
                }
            }
            game.setMaxTry(game.getMaxTry() - 1);
        }
    }
}
