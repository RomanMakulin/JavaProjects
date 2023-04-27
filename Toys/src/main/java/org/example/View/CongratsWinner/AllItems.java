package org.example.View.CongratsWinner;

import org.example.Model.Interfaces.Winner;
import org.example.Model.Toy;

import java.util.List;

public class AllItems implements Winner {
    @Override
    public void classic(List<Toy> items) {
        System.out.println("WIN! Your items: ");
        for (int i = 0; i < items.size(); i++) {
            System.out.println(items.get(i));
        }
    }
}
