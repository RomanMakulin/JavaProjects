package org.example;

import org.example.Model.Answer;
import org.example.Model.Game;
import org.example.View.InputWorld;

public class Main {
    public static void main(String[] args) {

        Game game = new Game(3);
        new AnswerLogic().buttonClick(game);



    }
}