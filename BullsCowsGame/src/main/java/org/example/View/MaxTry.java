package org.example.View;

import org.example.Model.Game;
import org.example.Model.Interfaces.ViewStatus;

public class MaxTry implements ViewStatus {
    @Override
    public void status(Game game){
        System.out.println("Количество оставшихся попыток: " + game.getMaxTry());
    }
}
