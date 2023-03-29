package org.example.example.View;

import java.util.List;

public class Show {
    public void print(List item){
        for (int i = 0; i < item.size(); i++) {
            System.out.println(item.get(i));
        }
    }
}
