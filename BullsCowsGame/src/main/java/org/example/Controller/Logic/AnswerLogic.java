package org.example.Controller.Logic;

import org.example.Model.Answer;
import org.example.Model.Game;
import org.example.View.MaxTry;
import org.example.View.WrongInput;

public class AnswerLogic {
    public void buttonClick(Game game) {
        while (game.getMaxTry() > 0) {
            Answer answer = new Answer();

            if (game.getWord().length() == answer.getUserInput().length()) {
                new CountBullsCows().service(game, answer);
                new CheckWinner().service(game, answer);
            }
            else new WrongInput().print();
            new MaxTry().status(game);

        }
    }
}
