package org.example.View;

import org.example.Model.Interfaces.ShowMenu;
import org.example.Model.Toy;

import java.util.List;

public class ViewMyList implements ShowMenu {
    @Override
    public void view(List<Toy> items){
        for (int i = 0; i < items.size(); i++) {
            System.out.println(items.get(i));
        }
    }
}
