package org.example.Controller;

import org.example.Controller.Logic.AnswerLogic;
import org.example.Model.Game;

public class Controller {
    public void buttonClick(){
        Game game = new Game(3);
        new AnswerLogic().buttonClick(game);
    }
}
