package org.example.example.Controller.CreateAthelets;

import org.example.example.Model.Athletes.Athletes;
import org.example.example.View.InputInt;
import org.example.example.View.InputStr;
import org.example.example.Model.Athletes.Human;


import java.util.List;

public class HumanAdd implements Create{

    @Override
    public void add(List<Athletes> athletes) {
        athletes.add(new Human(new InputStr().input("Name: "), new InputInt().input("Max run dist: "),
                new InputInt().input("Max jump: ")));
    }
}
