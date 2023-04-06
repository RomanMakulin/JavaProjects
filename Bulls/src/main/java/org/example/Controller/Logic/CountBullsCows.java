package org.example.Controller.Logic;

import org.example.Model.Answer;
import org.example.Model.Game;
import org.example.Model.Interfaces.LogicGame;

public class CountBullsCows implements LogicGame {
    @Override
    public void service(Game game, Answer answer) {
        for (int i = 0; i < game.getWord().length(); i++) {
            if (game.getWord().charAt(i) == answer.getUserInput().charAt(i)) {
                answer.setBulls(answer.getBulls() + 1);
            }
            if (game.getWord().contains(Character.toString(answer.getUserInput().charAt(i)))) {
                answer.setCows(answer.getCows() + 1);
            }
        }
    }
}
