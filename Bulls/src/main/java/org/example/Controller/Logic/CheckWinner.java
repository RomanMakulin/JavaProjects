package org.example.Controller.Logic;

import org.example.Model.Answer;
import org.example.Model.Game;
import org.example.Model.Interfaces.LogicGame;
import org.example.Model.Status;
import org.example.View.BullsCows;
import org.example.View.ShowStatus;

public class CheckWinner implements LogicGame {
    @Override
    public void service(Game game, Answer answer) {
        new BullsCows().print(answer);
        if (game.getWord().equals(answer.getUserInput())) {
            game.setStatus(Status.WIN);
            new ShowStatus().status(game);
            System.exit(1);
        } else {
            game.setStatus(Status.LOSE);
            game.setMaxTry(game.getMaxTry() - 1);
        }
        if (game.getMaxTry() == 0) new ShowStatus().status(game);
    }
}
