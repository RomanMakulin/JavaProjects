package org.example.View;

import org.example.Model.Counter;

public class CountAdd {
    public void show(Counter counter){
        System.out.println("\nКоличество добавленных животных: " + counter.getCount() + "\n");
    }
}
