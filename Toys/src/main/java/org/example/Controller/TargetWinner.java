package org.example.Controller;

import org.example.Model.Toy;
import org.example.View.ViewPrises;

import java.util.List;

public class TargetWinner {
    public void checkWinner(List<Toy> toyList){
        int max = toyList.get(0).getWidth();
        Toy need = null;
        for (int i = 0; i < toyList.size(); i++) {
            if (toyList.get(i).getWidth() > max) {
                max = toyList.get(i).getWidth();
                need = toyList.get(i);
            }
        }
        new ViewPrises().check(need);
    }
}
