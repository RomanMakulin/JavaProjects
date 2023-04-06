package org.example.View;

import org.example.Model.Game;
import org.example.Model.Interfaces.ViewStatus;

public class ShowStatus implements ViewStatus {
    @Override
    public void status(Game game){
        System.out.println("Игра закончена! Статус: " + game.getStatus());
    }
}
