package org.example.View;

import org.example.Model.Toy;

import java.util.List;

public class ViewToyList {
    public void view(List<Toy> toyList){
        for (int i = 0; i < toyList.size(); i++) {
            System.out.println(toyList.get(i));
        }
    }
}
