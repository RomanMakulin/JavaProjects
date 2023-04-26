package org.example.View;

import org.example.Model.Toy;

import java.util.List;

public class Win {
    public void classic(List<Toy> high){
        System.out.println("WIN!!\nClassic items: ");
        for (int i = 0; i < high.size(); i++) {
            System.out.println(high.get(i));
        }
    }
    public void rare(List<Toy> low){
        System.out.println("Rare items: ");
        for (int i = 0; i < low.size(); i++) {
            System.out.println(low.get(i));
        }
    }
}
