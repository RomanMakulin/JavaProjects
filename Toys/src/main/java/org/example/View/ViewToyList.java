package org.example.View;

import org.example.Model.Interfaces.ShowMenu;
import org.example.Model.Toy;

import java.util.List;

public class ViewToyList implements ShowMenu {
    @Override
    public void view(List<Toy> items){
        if (items.isEmpty()) new ListNull().print();
        else{
            System.out.println("Toy's list: ");
            for (int i = 0; i < items.size(); i++) {
                System.out.println(items.get(i));
            }
        }
    }
}
